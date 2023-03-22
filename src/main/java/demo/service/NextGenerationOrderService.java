package demo.service;

import demo.dto.OrderDto;

public class NextGenerationOrderService {

	public OrderResult executeOrder(OrderDto order) {
		if (order == null) {
			return OrderResult.FAILED_ERROR;
		} else {
			return OrderResult.SUCCESSFUL;
		}
	}

	public enum OrderResult {
		SUCCESSFUL,
		SUCCESSFUL_PAID,
		SUCCESSFUL_PAYMENT_PENDING,
		ON_HOLD,
		FAILED_REJECTED,
		FAILED_ERROR,
	}
}
