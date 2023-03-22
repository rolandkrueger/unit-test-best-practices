package demo.dto;

import java.time.LocalDate;

public record PaymentDetailsDto(String contractCode, LocalDate pricingDate, String paymentOptions,
								String paymentMethod, String paymentProvider) {
}
