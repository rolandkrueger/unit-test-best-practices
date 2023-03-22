package demo.dto;

import demo.values.PartNumber;

public record ItemDto(PartNumber partNumber, int position, int amount, String unit,
					  String materialNumber, String productName, String orderCode,
					  String productionCountry, String productInformation, String details,
					  int productionTimeInDays, boolean isConfigurable,
					  boolean isConfiguredCompletely, boolean isSalesRestricted,
					  boolean isPriceOnRequest, ConfigurationDto configurationDto) {
}
