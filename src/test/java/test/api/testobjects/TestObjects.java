package test.api.testobjects;

public final class TestObjects {

	private static final UserTestObjects users;
	private static final CustomerDetailTestObjects customerDetails;
	private static final OrderDataTestObjectGroup orderDataGroup;
	private static final ProductDataTestObjectGroup productDataGroup;

	static {
		productDataGroup = new ProductDataTestObjectGroup();
		users = new UserTestObjects();
		customerDetails = new CustomerDetailTestObjects();
		orderDataGroup = new OrderDataTestObjectGroup();
	}

	private TestObjects() {
	}

	public static UserTestObjects users() {
		return users;
	}

	public static CustomerDetailTestObjects customerDetails() {
		return customerDetails;
	}

	public static OrderDataTestObjectGroup orderData() {
		return orderDataGroup;
	}

	public static ProductDataTestObjectGroup productData() {
		return productDataGroup;
	}
}
