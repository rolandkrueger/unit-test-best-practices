package demo.nestedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Test des Bestellprozesses")
public class NestedTest {

	@Nested
	@DisplayName("mit Standard-Kunde")
	class StandardCustomer {
		@Test
		@DisplayName("erfolgreiche Bestellung")
		void testStandardCustomerOrderSuccess() {
			assertTrue(true);
		}

		@Test
		@DisplayName("Bestellung mit Bestellsperre")
		void testStandardCustomerOrderWithOrderBlock() {
			assertTrue(true);
		}

		@Test
		@DisplayName("Bestellung mit verkaufsbeschränkten Produkten")
		void testStandardCustomerOrderWithRestrictedProducts() {
			assertTrue(true);
		}

		@Test
		@DisplayName("Bestellung schlägt fehl")
		void testStandardCustomerOrderFailure() {
			assertTrue(true);
		}
	}

	@Nested
	@DisplayName("mit Premiumkunde")
	class PremiumCustomer {
		@Test
		@DisplayName("erfolgreiche Bestellung")
		void testPremiumCustomerOrderSuccess() {
			assertTrue(true);
		}

		@Test
		@DisplayName("Bestellung mit Bestellsperre")
		void testPremiumCustomerOrderWithOrderBlock() {
			assertTrue(true);
		}

		@Test
		@DisplayName("Bestellung mit verkaufsbeschränkten Produkten")
		void testPremiumCustomerOrderWithRestrictedProducts() {
			assertTrue(true);
		}
	}

	@Nested
	@DisplayName("mit anonymem Benutzer")
	class AnonymousUser {

		@Test
		@DisplayName("erfolgreiche Bestellung")
		void testAnonymousUserOrderSuccess() {
			assertTrue(true);
		}

		@Test
		@DisplayName("Bestellung schlägt fehl")
		void testAnonymousUserOrderFailure() {
			assertTrue(true);
		}

		@Test
		@DisplayName("Bestellung mit verkaufsbeschränkten Produkten")
		void testAnonymousUserOrderWithRestrictedProducts() {
			assertTrue(true);
		}
	}
}
