package demo.dto;

import demo.user.User;

import java.time.LocalDate;
import java.util.List;

public record OrderDto(User placedBy, String orderNumber, CustomerDetailsDto customerDetails,
					   List<ItemDto> items, PaymentDetailsDto paymentDetails,
					   String shoppingCartNumber, boolean quoteCreatedByCustomer,
					   LocalDate orderDate, List<String> messages) {


}
