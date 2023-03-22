package demo.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConfigurationDto {
	private final String configId;
	private final boolean isProvidedByCustomer;
	private List<ConfigurationOptionDto> mandatoryConfiguration;
	private List<ConfigurationOptionDto> optionalConfiguration;

	public ConfigurationDto(String configId, boolean isProvidedByCustomer) {
		this.configId = configId;
		this.isProvidedByCustomer = isProvidedByCustomer;
		mandatoryConfiguration = new ArrayList<>();
		optionalConfiguration = new ArrayList<>();
	}

	public ConfigurationDto(String configId,
							boolean isProvidedByCustomer,
							List<ConfigurationOptionDto> mandatoryConfiguration,
							List<ConfigurationOptionDto> optionalConfiguration) {
		this(configId, isProvidedByCustomer);
		this.mandatoryConfiguration = mandatoryConfiguration;
		this.optionalConfiguration = optionalConfiguration;
	}

	public String getConfigId() {
		return configId;
	}

	public boolean isProvidedByCustomer() {
		return isProvidedByCustomer;
	}

	public List<ConfigurationOptionDto> getMandatoryConfiguration() {
		return Collections.unmodifiableList(mandatoryConfiguration);
	}

	public List<ConfigurationOptionDto> getOptionalConfiguration() {
		return Collections.unmodifiableList(optionalConfiguration);
	}

	public void addMandatoryConfiguration(ConfigurationOptionDto optionDto) {
		mandatoryConfiguration.add(optionDto);
	}

	public void addOptionalConfiguration(ConfigurationOptionDto optionDto) {
		optionalConfiguration.add(optionDto);
	}
}
