package test.api.testobjects;

import demo.user.Role;
import demo.user.User;

public final class UserTestObjects {

	public User anonymousUser() {
		return new User("ANONYMOUS", Role.ANONYMOUS, false);
	}

	public User lockedUser() {
		return new User("LOCKED", Role.LIMITED_USER, true);
	}

	public User anyCustomer() {
		return new User("jane_doe", Role.CUSTOMER, false);
	}

	public User limitedUser() {
		return new User("john_doe", Role.LIMITED_USER, false);
	}

	public User administrator() {
		return new User("admin", Role.ADMINISTRATOR, false);
	}

}
