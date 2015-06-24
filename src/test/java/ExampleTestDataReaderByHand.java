
import readers.TestDataReader;
import readers.exceptions.EmptyDataReaderException;
import readers.exceptions.InvalidDataReaderException;
import spike.Example;

public class ExampleTestDataReaderByHand extends TestDataReader {

	private Example example;

	private final static String[] CONSTRUCTOR_NAMES = {"Example", "ExampleInt", "ExampleIntInt"};

	public ExampleTestDataReaderByHand() {
		super("C:\\Users\\CarlosDavid\\git\\exampleProject\\src\\test\\resources\\spike\\ExampleTestData.xlsx");
	}
	
	public boolean hasNext(String constructorName) {
		while (this.hasNext()) {
			this.getDataReader().next();
			if (this.existsConstructor(constructorName)) {
				return true;
			}
		}
		return false;
	}

	public void next() {
		this.getDataReader().next();
		int i = 0;
		this.example = null;
		while (i < CONSTRUCTOR_NAMES.length && !this.existsConstructor(CONSTRUCTOR_NAMES[i])) {
			i++;
		}
		this.construct(CONSTRUCTOR_NAMES[i]);
	}

	public void next(String constructorName) {
		this.example = null;
		this.construct(constructorName);
	}

	private boolean existsConstructor(String constructorName) {
		switch (constructorName) {
		case "Example":
			return existsConstructorExample();

		case "ExampleInt":
			return existsConstructorExampleInt();

		case "ExampleIntInt":
			return existsConstructorExampleIntInt();
			
		default:
			return false;
		}
	}

	private boolean existsConstructorExample() {
		try {
			String x = this.getString("getExample");
			if (!x.equalsIgnoreCase("x")) {
				throw new InvalidDataReaderException("Data under column \"getExample\" at row: "+ this.getDataReader().getRow()+ " should be x or X");
			}
		} catch (EmptyDataReaderException e) {
			return false;
		} catch (InvalidDataReaderException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return true;
	}

	private boolean existsConstructorExampleInt() {
		try {
			this.getInt("getExampleIntValue1");
		} catch (EmptyDataReaderException e) {
			return false;
		}
		return true;
	}
	
	private boolean existsConstructorExampleIntInt() {
		try {
			this.getInt("getExampleIntIntValue1");
			this.getInt("getExampleIntIntValue2");
		} catch (EmptyDataReaderException e) {
			return false;
		}
		return true;
	}

	private void construct(String constructorName) {
		switch (constructorName) {
		case "Example":
			constructExample();
			break;

		case "ExampleInt":
			constructExampleInt();
			break;

		case "ExampleIntInt":
			constructExampleIntInt();
			break;
		}
	}

	private void constructExample() {
		this.example = new Example();
	}
	
	private void constructExampleInt() {
		try {
			int exampleIntValue1 = this.getInt("getExampleIntValue1");
			this.example = new Example(exampleIntValue1);
		} catch (EmptyDataReaderException e) {

		}
	}
	
	private void constructExampleIntInt() {
		try {
			int ExampleIntIntValue1 = this.getInt("getExampleIntIntValue1");
			int ExampleIntIntValue2 = this.getInt("getExampleIntIntValue2");
			this.example = new Example(ExampleIntIntValue1,
					ExampleIntIntValue2);
		} catch (EmptyDataReaderException e) {
	
		}
	}

	public Example getExample() {
		return example;
	}

	public int getM1Result() {
		this.setTestTarget("testM1");
		this.getDataReader().next();
		int result = 0;
		try {
			result = this.getInt("getM1Result");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1Result");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1IntParameter0() {
		this.setTestTarget("testM1Int");
		int result = 0;
		try {
			result = this.getInt("getM1IntParameter0");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntParameter0");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1IntResult() {
		this.setTestTarget("testM1Int");
		this.getDataReader().next();
		int result = 0;
		try {
			result = this.getInt("getM1IntResult");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntResult");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1FloatResult() {
		this.setTestTarget("testM1Float");
		this.getDataReader().next();
		int result = 0;
		try {
			result = this.getInt("getM1FloatResult");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1FloatResult");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public float getM1FloatParameter0() {
		this.setTestTarget("testM1Float");
		float result = 0;
		try {
			result = this.getFloat("getM1FloatParameter0");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1FloatParameter0");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1DoubleResult() {
		this.setTestTarget("testM1Double");
		this.getDataReader().next();
		int result = 0;
		try {
			result = this.getInt("getM1DoubleResult");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1DoubleResult");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public double getM1DoubleParameter0() {
		this.setTestTarget("testM1Double");
		double result = 0;
		try {
			result = this.getDouble("getM1DoubleParameter0");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1DoubleParameter0");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;

	}

	public int getM1BooleanResult() {
		this.setTestTarget("testM1Boolean");
		this.getDataReader().next();
		int result = 0;
		try {
			result = this.getInt("getM1BooleanResult");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1BooleanResult");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public boolean getM1BooleanParameter0() {
		this.setTestTarget("testM1Boolean");
		boolean result = false;
		try {
			result = this.getBoolean("getM1BooleanParameter0");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1BooleanParameter0");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1StringResult() {
		this.setTestTarget("testM1String");
		this.getDataReader().next();
		int result = 0;
		try {
			result = this.getInt("getM1StringResult");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1StringResult");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public String getM1StringParameter0() {
		this.setTestTarget("testM1String");
		String result = null;
		try {
			result = this.getString("getM1StringParameter0");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1StringParameter0");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1IntIntResult() {
		this.setTestTarget("testM1IntInt");
		this.getDataReader().next();
		int result = 0;
		try {
			result = this.getInt("getM1IntIntResult");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntIntResult");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1IntIntParameter0() {
		this.setTestTarget("testM1IntInt");
		int result = 0;
		try {
			result = this.getInt("getM1IntIntParameter0");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntIntParameter0");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1IntIntParameter1() {
		this.setTestTarget("testM1IntInt");
		int result = 0;
		try {
			result = this.getInt("getM1IntIntParameter1");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntIntParameter1");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}
	
	public String getToStringResult() {
		this.setTestTarget("testToString");
		String result = null;
		try {
			result = this.getString("getToStringResult");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1StringX");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
		
	}

}
