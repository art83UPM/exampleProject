package package1;

public class Class2 {
	private String string;

	public Class2() {
		this.string = "hello";
	}

	public Class2(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String strng) {
		this.string = strng;
	}

	public String m1(String otherString) {
		return this.string + otherString;
	}

	public String m1(int i) {
		return this.string + i;
	}

	public int m2() {
		return this.string.length() * 2;
	}
}
