package test.api.assertions;

import demo.data.FooBar;
import demo.service.NextGenerationOrderService.OrderResult;

public class CustomAssertions {

	public static OrderResultAssert assertThat(OrderResult actual) {
		return new OrderResultAssert(actual);
	}

	public static FooBarAssert assertThat(FooBar actual) {
		return new FooBarAssert(actual);
	}
}
