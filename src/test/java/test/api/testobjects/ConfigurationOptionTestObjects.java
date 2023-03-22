package test.api.testobjects;

import demo.dto.ConfigurationOptionDto;

public class ConfigurationOptionTestObjects {

	public ConfigurationOptionDto option_A() {
		return new ConfigurationOptionDto("A", "aaa");
	}

	public ConfigurationOptionDto option_B() {
		return new ConfigurationOptionDto("B", "bbb");
	}

	public ConfigurationOptionDto option_C() {
		return new ConfigurationOptionDto("C", "ccc");
	}
}
