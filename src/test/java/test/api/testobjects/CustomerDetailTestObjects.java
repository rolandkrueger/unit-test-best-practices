package test.api.testobjects;

import demo.dto.CustomerDetailsDto;

public class CustomerDetailTestObjects {

	public CustomerDetailsDto standardCustomer() {
		return new CustomerDetailsDto("customer_01", false, false, "de");
	}

	public CustomerDetailsDto premiumCustomer() {
		return new CustomerDetailsDto("customer_02", true, false, "de");
	}

	public CustomerDetailsDto blockedCustomer() {
		return new CustomerDetailsDto("customer_03", false, true, "de");
	}

	public CustomerDetailsDto foreignCustomer() {
		return new CustomerDetailsDto("customer_fr_01", false, false, "fr");
	}
}
