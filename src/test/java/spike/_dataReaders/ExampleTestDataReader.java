package spike._dataReaders;

import readers.TestDataReader;
import readers.exceptions.EmptyDataReaderException;
import readers.exceptions.InvalidDataReaderException;
import spike.Example;

public class ExampleTestDataReader extends TestDataReader {

   private Example example;

   private final static String[] CONSTRUCTOR_NAMES = {"ExampleIntInt", "ExampleInt", "Example"};

   public ExampleTestDataReader() {
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
      case "ExampleIntInt":
         return existsConstructorExampleIntInt();

      case "ExampleInt":
         return existsConstructorExampleInt();

      case "Example":
         return existsConstructorExample();

      default:
         return false;
      }
   }

   private void construct(String constructorName) {
      switch (constructorName) {
      case "ExampleIntInt":
         constructExampleIntInt();
         break;

      case "ExampleInt":
         constructExampleInt();
         break;

      case "Example":
         constructExample();
         break;

      }
   }

   public Example getExample() {
      return this.example;
   }

   private boolean existsConstructorExampleIntInt() {
      try {
         this.getInt("getExampleIntIntParameter0");
         this.getInt("getExampleIntIntParameter1");
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructExampleIntInt() {
      try {
         int ExampleIntIntParameter0 = this.getInt("getExampleIntIntParameter0");
         int ExampleIntIntParameter1 = this.getInt("getExampleIntIntParameter1");
      this.example= new Example(ExampleIntIntParameter0, ExampleIntIntParameter1);
      } catch (EmptyDataReaderException e) {}
   }

   private boolean existsConstructorExampleInt() {
      try {
         this.getInt("getExampleIntParameter0");
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructExampleInt() {
      try {
         int ExampleIntParameter0 = this.getInt("getExampleIntParameter0");
      this.example= new Example(ExampleIntParameter0);
      } catch (EmptyDataReaderException e) {}
   }

   private boolean existsConstructorExample() {
      try {
         String x = this.getString("getExample");
         if (!x.equalsIgnoreCase("x")) {
            throw new InvalidDataReaderException("Data under column \"getExample\" at row: "+ this.getDataReader().getRow()+ " should be x or X");
         }
      } catch (InvalidDataReaderException e) {
         System.out.println(e.getMessage());
         System.exit(0);
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructExample() {
      this.example= new Example();
   }

   public String getToStringResult() {
      this.setTestTarget("testToString");
      this.getDataReader().next();
      String result = null;
      try {
         result = this.getString("getToStringResult");
      } catch (EmptyDataReaderException e) {
         System.out.println("Error in getToStringResult");
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

}
