package demo.nestedTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlatTest {

	@Test
	void testAnonymousUserOrderSuccess() {
		assertTrue(true);
	}

	@Test
	void testAnonymousUserOrderFailure() {
		assertTrue(true);
	}

	@Test
	void testAnonymousUserOrderWithRestrictedProducts() {
		assertTrue(true);
	}

	@Test
	void testPremiumCustomerOrderSuccess() {
		assertTrue(true);
	}

	@Test
	void testPremiumCustomerOrderWithOrderBlock() {
		assertTrue(true);
	}

	@Test
	void testPremiumCustomerOrderWithRestrictedProducts() {
		assertTrue(true);
	}

	@Test
	void testStandardCustomerOrderSuccess() {
		assertTrue(true);
	}

	@Test
	void testStandardCustomerOrderWithOrderBlock() {
		assertTrue(true);
	}

	@Test
	void testStandardCustomerOrderWithRestrictedProducts() {
		assertTrue(true);
	}

	@Test
	void testStandardCustomerOrderFailure() {
		assertTrue(true);
	}
}
