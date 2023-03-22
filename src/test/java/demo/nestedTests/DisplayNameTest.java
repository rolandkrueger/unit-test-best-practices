package demo.nestedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Bestellungen mit verschiedenen Kundentypen")
public class DisplayNameTest {

	@Test
	@DisplayName("Bestellung erfolgreich mit anonymem Kunde")
	void testAnonymousUserOrderSuccess() {
		// test code
	}

	@Test
	@DisplayName("Bestellung nicht erfolgreich mit anonymem Kunde")
	void testAnonymousUserOrderFailure() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Anonymer Kunde bestellt eingeschränkte Produkte")
	void testAnonymousUserOrderWithRestrictedProducts() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Bestellung erfolgreich mit registriertem Kunde")
	void testPremiumCustomerOrderSuccess() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Premium-Kunde bestellt mit Bestellsperre")
	void testPremiumCustomerOrderWithOrderBlock() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Premium-Kunde bestellt eingeschränkte Produkte")
	void testPremiumCustomerOrderWithRestrictedProducts() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Bestellung erfolgreich mit Standard-Kunde")
	void testStandardCustomerOrderSuccess() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Standard-Kunde bestellt mit Bestellsperre")
	void testStandardCustomerOrderWithOrderBlock() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Standard-Kunde bestellt eingeschränkte Produkte")
	void testStandardCustomerOrderWithRestrictedProducts() {
		assertTrue(true);
	}

	@Test
	@DisplayName("Bestellung nicht erfolgreich mit Standard-Kunde")
	void testStandardCustomerOrderFailure() {
		assertTrue(true);
	}
}
