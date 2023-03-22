package test.api.injection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface TestUser {

	UserType value() default UserType.ANY_CUSTOMER;

	enum UserType {
		ANONYMOUS_USER,
		ADMINISTRATOR,
		LIMITED_USER,
		ANY_CUSTOMER,
		LOCKED_USER
	}
}
