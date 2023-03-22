package test.api.assertions;

import demo.data.FooBar;
import org.assertj.core.api.AbstractAssert;

public class FooBarAssert extends AbstractAssert<FooBarAssert, FooBar> {

	protected FooBarAssert(FooBar actual) {
		super(actual, FooBarAssert.class);
	}

	public void isAProperFooBar() {
		if (!(actual.isFoo() && actual.isBar())) {
			failWithMessage("%s is not a proper FooBar", actual);
		}
	}
}
