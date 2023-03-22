package demo.user;

import java.util.Objects;

public class User {
	private final String username;
	private final Role role;
	private boolean isAccountLocked;

	public User(String username) {
		this(username, Role.ANONYMOUS, false);
	}

	public User(String username, Role role) {
		this(username, role, false);
	}

	public User(String username, Role role, boolean isAccountLocked) {
		Objects.requireNonNull(username);
		Objects.requireNonNull(role);
		this.username = username;
		this.role = role;
		this.isAccountLocked = isAccountLocked;
	}

	public Role getRole() {
		return role;
	}

	public String getUsername() {
		return username;
	}

	public boolean isAnonymous() {
		return role == Role.ANONYMOUS;
	}

	public boolean isAccountLocked() {
		return isAccountLocked;
	}

	public void setAccountLocked(boolean accountLocked) {
		isAccountLocked = accountLocked;
	}
}
