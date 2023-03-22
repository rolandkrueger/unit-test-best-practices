package demo.data;

public class FooBar {
	private final boolean isFoo;
	private final boolean isBar;

	public FooBar(boolean isFoo, boolean isBar) {
		this.isFoo = isFoo;
		this.isBar = isBar;
	}

	public boolean isFoo() {
		return isFoo;
	}

	public boolean isBar() {
		return isBar;
	}

	@Override
	public String toString() {
		return "FooBar{" +
				"isFoo=" + isFoo +
				", isBar=" + isBar +
				'}';
	}
}
