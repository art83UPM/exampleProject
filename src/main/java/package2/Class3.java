package package2;

public class Class3 {
	private boolean value;

	public Class3() {
		this.value = true;
	}
	
	public Class3(boolean value) {
		this.value = value;
	}

	public boolean isValue() {
		return value;
	}
	
	public boolean m3(boolean otherValue) {
		return this.value && otherValue;
	}
}
