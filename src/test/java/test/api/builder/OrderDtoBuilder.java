package test.api.builder;

import test.api.testobjects.TestObjects;
import demo.dto.CustomerDetailsDto;
import demo.dto.ItemDto;
import demo.dto.OrderDto;
import demo.dto.PaymentDetailsDto;
import demo.user.User;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public final class OrderDtoBuilder {

	private User placedBy = TestObjects.users().anyCustomer();
	private String orderNumber = "CO_10000";
	private CustomerDetailsDto customerDetails = TestObjects.customerDetails().standardCustomer();
	private List<ItemDto> items = List.of(TestObjects.productData().items().standardItem());
	private PaymentDetailsDto paymentDetails = null;
	private String shoppingCartNumber = "1";
	private boolean quoteCreatedByCustomer = false;
	private LocalDate orderDate = LocalDate.now();
	private List<String> messages = Collections.emptyList();

	public OrderDto build() {
		return new OrderDto(placedBy, orderNumber, customerDetails, items, paymentDetails,
				shoppingCartNumber, quoteCreatedByCustomer, orderDate, messages);
	}

	public OrderDtoBuilder withPlacedBy(User placedBy) {
		this.placedBy = placedBy;
		return this;
	}

	public OrderDtoBuilder withOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	public OrderDtoBuilder withCustomerDetails(CustomerDetailsDto customerDetails) {
		this.customerDetails = customerDetails;
		return this;
	}

	public OrderDtoBuilder withItems(List<ItemDto> items) {
		this.items = items;
		return this;
	}

	public OrderDtoBuilder withPaymentDetails(PaymentDetailsDto paymentDetails) {
		this.paymentDetails = paymentDetails;
		return this;
	}

	public OrderDtoBuilder withShoppingCartNumber(String shoppingCartNumber) {
		this.shoppingCartNumber = shoppingCartNumber;
		return this;
	}

	public OrderDtoBuilder withQuoteCreatedByCustomer(boolean quoteCreatedByCustomer) {
		this.quoteCreatedByCustomer = quoteCreatedByCustomer;
		return this;
	}

	public OrderDtoBuilder withOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
		return this;
	}

	public OrderDtoBuilder withMessages(List<String> messages) {
		this.messages = messages;
		return this;
	}
}
