package test.api.testobjects;

import test.api.builder.ItemDtoBuilder;
import demo.dto.ItemDto;

public class ItemTestObjects {

	public ItemDto standardItem() {
		return new ItemDtoBuilder().notConfigurable().build();
	}

	public ItemDto fullyConfiguredItem() {
		return new ItemDtoBuilder()
				.withFullConfiguration(
						TestObjects.productData().configurations().standardConfiguration()
				).build();
	}

	public ItemDto unconfiguredItem() {
		return new ItemDtoBuilder().withIncompleteConfiguration().build();
	}

	public ItemDtoBuilder standardItemBuilder() {
		return new ItemDtoBuilder();
	}
}
