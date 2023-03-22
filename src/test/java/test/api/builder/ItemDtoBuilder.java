package test.api.builder;

import demo.dto.ConfigurationDto;
import demo.dto.ItemDto;
import test.api.testobjects.TestObjects;
import demo.values.PartNumber;

public class ItemDtoBuilder {
	private PartNumber partNumber = TestObjects.productData().randomPrdPartNumber();
	private int position = 1;
	private int amount = 1;
	private String unit = "PC";
	private String materialNumber = "1000";
	private String productName = "Acme-2000";
	private String orderCode = "9999";
	private String productionCountry = "de";
	private String productInformation = "product information";
	private String details = "item details";
	private int productionTimeInDays = 1;
	private boolean isConfigurable = false;
	private boolean isConfiguredCompletely = true;
	private boolean isSalesRestricted = false;
	private boolean isPriceOnRequest = false;
	private ConfigurationDto configurationDto = null;

	public ItemDto build() {
		return new ItemDto(partNumber, position, amount, unit, materialNumber, productName,
				orderCode, productionCountry, productInformation, details, productionTimeInDays,
				isConfigurable, isConfiguredCompletely, isSalesRestricted, isPriceOnRequest,
				configurationDto);
	}

	public ItemDtoBuilder salesRestricted() {
		isSalesRestricted = true;
		return this;
	}

	public ItemDtoBuilder priceIsOnRequest() {
		isPriceOnRequest = true;
		return this;
	}

	public ItemDtoBuilder notConfigurable() {
		isConfigurable = false;
		isConfiguredCompletely = true;
		configurationDto = null;
		return this;
	}

	public ItemDtoBuilder withFullConfiguration(ConfigurationDto configuration) {
		isConfigurable = true;
		isConfiguredCompletely = true;
		configurationDto = configuration;
		return this;
	}

	public ItemDtoBuilder withIncompleteConfiguration() {
		isConfigurable = true;
		isConfiguredCompletely = false;
		configurationDto = null;
		return this;
	}

	public ItemDtoBuilder withPosition(int position) {
		this.position = position;
		return this;
	}

	public ItemDtoBuilder withPartNumber(PartNumber partNumber) {
		this.partNumber = partNumber;
		return this;
	}

	public ItemDtoBuilder withAmount(int amount) {
		this.amount = amount;
		return this;
	}

	public ItemDtoBuilder withUnit(String unit) {
		this.unit = unit;
		return this;
	}

	public ItemDtoBuilder withMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
		return this;
	}

	public ItemDtoBuilder withProductName(String productName) {
		this.productName = productName;
		return this;
	}

	public ItemDtoBuilder withOrderCode(String orderCode) {
		this.orderCode = orderCode;
		return this;
	}

	public ItemDtoBuilder withProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
		return this;
	}

	public ItemDtoBuilder withProductInformation(String productInformation) {
		this.productInformation = productInformation;
		return this;
	}

	public ItemDtoBuilder withDetails(String details) {
		this.details = details;
		return this;
	}

	public ItemDtoBuilder withProductionTimeInDays(int productionTimeInDays) {
		this.productionTimeInDays = productionTimeInDays;
		return this;
	}
}
