package demo.testObjects;

import demo.dto.CustomerDetailsDto;
import demo.dto.ItemDto;
import demo.dto.OrderDto;
import demo.service.OrderService;
import test.api.testobjects.TestObjects;
import demo.user.Role;
import demo.user.User;
import demo.values.PartNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestWithTestObjects {

	private OrderService service;

	@BeforeEach
	void setUp() {
		service = new OrderService();
	}

	@Test
	@DisplayName("Test mit umständlichem Testdaten-Setup")
	void testWithComplexSetup() {
		User testUser = new User("tanja_test", Role.CUSTOMER, false);

		CustomerDetailsDto customerDetails = new CustomerDetailsDto("customer_01", false,
				false, "de");
		ItemDto item1 = new ItemDto(new PartNumber("prd", 100), 1, 1, "PC",
				null, null, null, null,
				"", "", 1, false, true,
				false, false, null);

		ItemDto item2 = new ItemDto(new PartNumber("prd", 200), 2, 1, "PC",
				null, null, null, null,
				"", "", 1, false, true,
				false, false, null);

		OrderDto order = new OrderDto(testUser, "123456789", customerDetails,
				List.of(item1, item2), null, "1", false,
				LocalDate.now(), Collections.emptyList());

		boolean orderSuccess = service.executeOrder(order);
		assertTrue(orderSuccess, "Order was not processed successfully.");
	}

	@Test
	@DisplayName("Test mit vordefiniertem Standard-Testdatenobjekt")
	void testWithPredefinedTestObject() {
		User anon = TestObjects.users().anonymousUser();
		CustomerDetailsDto customer = TestObjects.customerDetails().standardCustomer();
		OrderDto order = TestObjects.orderData().orders().standardOrder();

		boolean orderSuccess = service.executeOrder(order);

		assertTrue(orderSuccess, "Order was not processed successfully.");
	}

	@Test
	@DisplayName("Test mit Builder und vordefinierten Standardwerten")
	void testWithConfiguredPredefinedTestObject() {

		OrderDto order = TestObjects
				.orderData()
				.orders()
				.standardOrderBuilder()
				.withPlacedBy(TestObjects
						.users()
						.limitedUser())
				.withCustomerDetails(TestObjects
						.customerDetails()
						.blockedCustomer())
				.build();

		boolean orderSuccess = service.executeOrder(order);

		assertFalse(orderSuccess, "Order should have been denied.");
	}
}
