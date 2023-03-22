package demo.service;

import demo.dto.OrderDto;

public class OrderService {

	public boolean executeOrder(OrderDto order) {
		if (order == null) {
			return true;
		} else {
			return !order.customerDetails().hasOrderBlock();
		}
	}


}
