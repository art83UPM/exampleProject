package spike._dataReaders;

import readers.TestDataReader;
import readers.exceptions.EmptyDataReaderException;
import readers.exceptions.InvalidDataReaderException;
import spike.Example;

public class ExampleTestDataReaderByHand extends TestDataReader {

	private Example example;

	private final static int CONSTRUCTOR_QUANTITY = 3;

	public ExampleTestDataReaderByHand() {
		super(
				"C:\\Users\\CarlosDavid\\git\\exampleProject\\src\\test\\resources\\ExampleWithSheets.xlsx");

	}

	public boolean hasNext() {
		this.setTestTarget("Constructors");
		return this.getDataReader().hasNext();
	}

	public boolean hasNext(int constructMode) {
		while (this.hasNext()) {
			this.getDataReader().next();
			if (this.existsConstructor(constructMode)) {
				return true;
			}
		}
		return false;
	}

	public void next() {
		this.getDataReader().next();
		int i = 0;
		this.example = null;
		while (i < CONSTRUCTOR_QUANTITY && !this.existsConstructor(i)) {
			i++;
		}
		this.construct(i);
	}

	public void next(int construcMode) {
		this.example = null;
		this.construct(construcMode);
	}

	private boolean existsConstructor(int constructMode) {
		boolean exists = true;
		switch (constructMode) {
		case 0:
			try {
				String x = this.getString("getExample");
				if (!x.equalsIgnoreCase("x")) {
					throw new InvalidDataReaderException(
							"Data under column \"getExample\" at row: "
									+ this.getDataReader().getRow()
									+ " should be x or X");
				}
			} catch (EmptyDataReaderException e) {
				exists = false;
			} catch (InvalidDataReaderException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
			break;

		case 1:
			try {
				this.getInt("getExampleIntValue1");
			} catch (EmptyDataReaderException e) {
				exists = false;
			}
			break;

		case 2:
			try {
				this.getInt("getExampleIntIntValue1");
				this.getInt("getExampleIntIntValue2");
			} catch (EmptyDataReaderException e) {
				exists = false;
			}
			break;
		}
		return exists;
	}

	private void construct(int constructMode) {
		switch (constructMode) {
		case 0:
			this.example = new Example();
			break;

		case 1:
			try {
				int exampleIntValue1 = this.getInt("getExampleIntValue1");
				this.example = new Example(exampleIntValue1);
			} catch (EmptyDataReaderException e) {

			}
			break;

		case 2:
			try {
				int ExampleIntIntValue1 = this.getInt("getExampleIntIntValue1");
				int ExampleIntIntValue2 = this.getInt("getExampleIntIntValue2");
				this.example = new Example(ExampleIntIntValue1,
						ExampleIntIntValue2);
			} catch (EmptyDataReaderException e) {

			}
			break;
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

	public int getM1IntX() {
		this.setTestTarget("testM1Int");
		int result = 0;
		try {
			result = this.getInt("getM1IntX");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntX");
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

	public float getM1FloatX() {
		this.setTestTarget("testM1Float");
		float result = 0;
		try {
			result = this.getFloat("getM1FloatX");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1FloatX");
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

	public double getM1DoubleX() {
		this.setTestTarget("testM1Double");
		double result = 0;
		try {
			result = this.getDouble("getM1DoubleX");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1DoubleX");
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

	public boolean getM1BooleanX() {
		this.setTestTarget("testM1Boolean");
		boolean result = false;
		try {
			result = this.getBoolean("getM1BooleanX");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1BooleanX");
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

	public String getM1StringX() {
		this.setTestTarget("testM1String");
		String result = null;
		try {
			result = this.getString("getM1StringX");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1StringX");
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

	public int getM1IntIntX() {
		this.setTestTarget("testM1IntInt");
		int result = 0;
		try {
			result = this.getInt("getM1IntIntX");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntIntX");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

	public int getM1IntIntY() {
		this.setTestTarget("testM1IntInt");
		int result = 0;
		try {
			result = this.getInt("getM1IntIntY");
		} catch (EmptyDataReaderException e) {
			System.out.println("Error in getM1IntIntY");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return result;
	}

}
