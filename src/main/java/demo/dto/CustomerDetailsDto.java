package demo.dto;

public record CustomerDetailsDto(String customerReference, boolean isPremium, boolean hasOrderBlock,
								 String countryOfOrigin) {
}