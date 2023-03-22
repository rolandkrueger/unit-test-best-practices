package test.api.injection;

import demo.dto.OrderDto;
import demo.user.User;
import demo.values.PartNumber;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import test.api.builder.ItemDtoBuilder;
import test.api.builder.OrderDtoBuilder;
import test.api.testobjects.TestObjects;

import java.lang.reflect.Parameter;
import java.util.Arrays;

public class TestObjectInjectionExtension implements ParameterResolver {

	@Override
	public boolean supportsParameter(ParameterContext parameterContext,
									 ExtensionContext extensionContext) throws ParameterResolutionException {

		Parameter parameter = parameterContext.getParameter();

		return Arrays.asList(
						User.class,
						OrderDto.class,
						PartNumber.class,
						ItemDtoBuilder.class,
						OrderDtoBuilder.class
				)
				.contains(parameter.getType());
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext,
								   ExtensionContext extensionContext) throws ParameterResolutionException {

		Parameter parameter = parameterContext.getParameter();

		if (parameter.getType() == User.class) {
			return resolveUser(parameter);
		} else if (parameter.getType() == OrderDto.class) {
			return TestObjects.orderData().orders().standardOrder();
		} else if (parameter.getType() == PartNumber.class) {
			return TestObjects.productData().randomPrdPartNumber();
		} else if (parameter.getType() == ItemDtoBuilder.class) {
			return TestObjects.productData().items().standardItemBuilder();
		} else if (parameter.getType() == OrderDtoBuilder.class) {
			return TestObjects.orderData().orders().standardOrderBuilder();
		} else {
			return null;
		}

	}

	private Object resolveUser(Parameter parameter) {
		TestUser testUserAnnotation = parameter.getAnnotation(TestUser.class);

		if (testUserAnnotation != null) {
			return switch (testUserAnnotation.value()) {
				case ANONYMOUS_USER -> TestObjects.users().anonymousUser();
				case ADMINISTRATOR -> TestObjects.users().administrator();
				case LIMITED_USER -> TestObjects.users().limitedUser();
				case LOCKED_USER -> TestObjects.users().lockedUser();
				case ANY_CUSTOMER -> TestObjects.users().anyCustomer();
			};
		}

		return TestObjects.users().anyCustomer();
	}
}
