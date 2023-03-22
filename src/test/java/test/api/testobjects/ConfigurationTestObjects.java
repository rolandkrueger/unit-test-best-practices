package test.api.testobjects;

import demo.dto.ConfigurationDto;

import java.util.UUID;

public class ConfigurationTestObjects {

	private String randomId() {
		return UUID.randomUUID().toString();
	}

	public ConfigurationDto customerProvidedConfiguration() {
		return new ConfigurationDto(randomId(), true);
	}

	public ConfigurationDto standardConfiguration() {
		return new ConfigurationDto(randomId(), false);
	}
}
