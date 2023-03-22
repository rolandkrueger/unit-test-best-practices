package demo.customAssertions;

import demo.data.FooBar;
import org.junit.jupiter.api.Test;
import test.api.assertions.CustomAssertions;

public class FooBarTest {

	@Test
	void testFooBar() {
		FooBar fooBar = new FooBar(true, false);

		CustomAssertions.assertThat(fooBar).isAProperFooBar();
	}
}
