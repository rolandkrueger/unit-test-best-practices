package test.api.assertions;

import demo.service.NextGenerationOrderService.OrderResult;
import org.assertj.core.api.AbstractAssert;

import java.util.EnumSet;

public class OrderResultAssert extends AbstractAssert<OrderResultAssert, OrderResult> {

	private static final EnumSet<OrderResult> SUCCESS_STATES;
	private static final EnumSet<OrderResult> FAILURE_STATES;

	static {
		SUCCESS_STATES = EnumSet.of(OrderResult.SUCCESSFUL, OrderResult.SUCCESSFUL_PAYMENT_PENDING
				, OrderResult.SUCCESSFUL_PAID);
		FAILURE_STATES = EnumSet.of(OrderResult.FAILED_ERROR, OrderResult.FAILED_REJECTED);
	}

	protected OrderResultAssert(OrderResult actual) {
		super(actual, OrderResultAssert.class);
	}

	public void wasSuccessful() {
		if (!SUCCESS_STATES.contains(actual)) {
			failWithActualExpectedAndMessage(actual, SUCCESS_STATES, "Order result is not one of " +
					"the successful states %s", SUCCESS_STATES);
		}
	}

	public void hasFailed() {
		if (!FAILURE_STATES.contains(actual)) {
			failWithActualExpectedAndMessage(actual, FAILURE_STATES, "Order result is not one of " +
					"the failure states %s", FAILURE_STATES);
		}
	}
}
