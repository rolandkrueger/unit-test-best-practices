package demo.values;

public class PartNumber {
	private String category;
	private int number;

	public PartNumber(String category, int number) {
		this.category = category;
		this.number = number;
	}

	public String getPartNumber() {
		return category.toUpperCase() + "-" + number;
	}
}
