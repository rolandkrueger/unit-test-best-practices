package test.api.testobjects;

import demo.values.PartNumber;

public class ProductDataTestObjectGroup {
	private final static ItemTestObjects items;
	private final static ConfigurationTestObjects configurations;
	private static int partNumberCount = 1;

	static {
		items = new ItemTestObjects();
		configurations = new ConfigurationTestObjects();
	}

	public ItemTestObjects items() {
		return items;
	}

	public ConfigurationTestObjects configurations() {
		return configurations;
	}

	public PartNumber randomPrdPartNumber() {
		return new PartNumber("prd", partNumberCount++);
	}

	public PartNumber randomSrvPartNumber() {
		return new PartNumber("srv", partNumberCount++);
	}
}
