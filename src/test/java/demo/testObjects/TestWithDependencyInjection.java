package demo.testObjects;

import demo.dto.OrderDto;
import demo.service.NextGenerationOrderService;
import demo.service.NextGenerationOrderService.OrderResult;
import demo.user.Role;
import demo.user.User;
import demo.values.PartNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.api.assertions.CustomAssertions;
import test.api.builder.ItemDtoBuilder;
import test.api.builder.OrderDtoBuilder;
import test.api.injection.TestUser;
import test.api.injection.UsesTestObjects;
import test.api.testobjects.TestObjects;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static test.api.injection.TestUser.UserType.ADMINISTRATOR;

@UsesTestObjects
public class TestWithDependencyInjection {

	@Test
	@DisplayName("Standard-User injizieren")
	void injectStandardUser(User user) {
		assertThat(user.getUsername()).isEqualTo(TestObjects.users().anyCustomer().getUsername());
		assertThat(user.getRole()).isEqualTo(Role.CUSTOMER);
	}

	@Test
	@DisplayName("Per Annotation spezifiziertes Testobjekt injizieren")
	void injectAdministratorUser(@TestUser(ADMINISTRATOR) User user) {
		assertThat(user.getRole()).isEqualTo(Role.ADMINISTRATOR);
	}

	@Test
	@DisplayName("Mehrere Testobjekte und Builder injizieren")
	void injectManyObjects(OrderDto order,
						  PartNumber partNumber,
						  ItemDtoBuilder itemDtoBuilder,
						  OrderDtoBuilder orderDtoBuilder) {

		itemDtoBuilder.withPartNumber(partNumber);
		orderDtoBuilder.withItems(singletonList(itemDtoBuilder.build()));

		NextGenerationOrderService service = new NextGenerationOrderService();

		OrderResult result =
				service.executeOrder(orderDtoBuilder.build());

		CustomAssertions.assertThat(result).wasSuccessful();
	}
}
