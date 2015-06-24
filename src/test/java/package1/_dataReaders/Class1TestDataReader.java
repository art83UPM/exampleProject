package package1._dataReaders;

import readers.TestDataReader;
import readers.exceptions.EmptyDataReaderException;
import readers.exceptions.InvalidDataReaderException;
import package1.Class1;

public class Class1TestDataReader extends TestDataReader {

   private Class1 class1;

   private final static String[] CONSTRUCTOR_NAMES = {"Class1IntInt", "Class1Int", "Class1"};

   public Class1TestDataReader() {
      super("C:\\Users\\CarlosDavid\\git\\exampleProject\\src\\test\\resources\\package1\\Class1TestData.xlsx");
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
      this.class1= null;
      while (i < CONSTRUCTOR_NAMES.length && !this.existsConstructor(CONSTRUCTOR_NAMES[i])) {
         i++;
      }
      this.construct(CONSTRUCTOR_NAMES[i]);
   }

   public void next(String constructorName) {
      this.class1= null;
      this.construct(constructorName);
   }

   private boolean existsConstructor(String constructorName) {
      switch (constructorName) {
      case "Class1IntInt":
         return existsConstructorClass1IntInt();

      case "Class1Int":
         return existsConstructorClass1Int();

      case "Class1":
         return existsConstructorClass1();

      default:
         return false;
      }
   }

   private void construct(String constructorName) {
      switch (constructorName) {
      case "Class1IntInt":
         constructClass1IntInt();
         break;

      case "Class1Int":
         constructClass1Int();
         break;

      case "Class1":
         constructClass1();
         break;

      }
   }

   public Class1 getClass1() {
      return this.class1;
   }

   private boolean existsConstructorClass1IntInt() {
      try {
         this.getInt("getClass1IntIntParameter0");
         this.getInt("getClass1IntIntParameter1");
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructClass1IntInt() {
      try {
         int Class1IntIntParameter0 = this.getInt("getClass1IntIntParameter0");
         int Class1IntIntParameter1 = this.getInt("getClass1IntIntParameter1");
      this.class1= new Class1(Class1IntIntParameter0, Class1IntIntParameter1);
      } catch (EmptyDataReaderException e) {}
   }

   private boolean existsConstructorClass1Int() {
      try {
         this.getInt("getClass1IntParameter0");
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructClass1Int() {
      try {
         int Class1IntParameter0 = this.getInt("getClass1IntParameter0");
      this.class1= new Class1(Class1IntParameter0);
      } catch (EmptyDataReaderException e) {}
   }

   private boolean existsConstructorClass1() {
      try {
         String x = this.getString("getClass1");
         if (!x.equalsIgnoreCase("x")) {
            throw new InvalidDataReaderException("Data under column \"getClass1\" at row: "+ this.getDataReader().getRow()+ " should be x or X");
         }
      } catch (InvalidDataReaderException e) {
         System.out.println(e.getMessage());
         System.exit(0);
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructClass1() {
      this.class1= new Class1();
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

