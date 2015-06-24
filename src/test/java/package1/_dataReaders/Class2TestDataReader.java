package package1._dataReaders;

import readers.TestDataReader;
import readers.exceptions.EmptyDataReaderException;
import readers.exceptions.InvalidDataReaderException;
import package1.Class2;

public class Class2TestDataReader extends TestDataReader {

   private Class2 class2;

   private final static String[] CONSTRUCTOR_NAMES = {"Class2", "Class2String"};

   public Class2TestDataReader() {
      super("C:\\Users\\CarlosDavid\\git\\exampleProject\\src\\test\\resources\\package1\\Class2TestData.xlsx");
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
      this.class2= null;
      while (i < CONSTRUCTOR_NAMES.length && !this.existsConstructor(CONSTRUCTOR_NAMES[i])) {
         i++;
      }
      this.construct(CONSTRUCTOR_NAMES[i]);
   }

   public void next(String constructorName) {
      this.class2= null;
      this.construct(constructorName);
   }

   private boolean existsConstructor(String constructorName) {
      switch (constructorName) {
      case "Class2":
         return existsConstructorClass2();

      case "Class2String":
         return existsConstructorClass2String();

      default:
         return false;
      }
   }

   private void construct(String constructorName) {
      switch (constructorName) {
      case "Class2":
         constructClass2();
         break;

      case "Class2String":
         constructClass2String();
         break;

      }
   }

   public Class2 getClass2() {
      return this.class2;
   }

   private boolean existsConstructorClass2() {
      try {
         String x = this.getString("getClass2");
         if (!x.equalsIgnoreCase("x")) {
            throw new InvalidDataReaderException("Data under column \"getClass2\" at row: "+ this.getDataReader().getRow()+ " should be x or X");
         }
      } catch (InvalidDataReaderException e) {
         System.out.println(e.getMessage());
         System.exit(0);
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructClass2() {
      this.class2= new Class2();
   }

   private boolean existsConstructorClass2String() {
      try {
         this.getInt("getClass2StringParameter0");
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructClass2String() {
      try {
         String Class2StringParameter0 = this.getString("getClass2StringParameter0");
      this.class2= new Class2(Class2StringParameter0);
      } catch (EmptyDataReaderException e) {}
   }

   public String getGetStringResult() {
      this.setTestTarget("testGetString");
      this.getDataReader().next();
      String result = null;
      try {
         result = this.getString("getGetStringResult");
      } catch (EmptyDataReaderException e) {
         System.out.println("Error in getGetStringResult");
         System.out.println(e.getMessage());
         System.exit(0);
      }
      return result;
   }

   public String getM1IntResult() {
      this.setTestTarget("testM1Int");
      this.getDataReader().next();
      String result = null;
      try {
         result = this.getString("getM1IntResult");
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

   public String getM1StringResult() {
      this.setTestTarget("testM1String");
      this.getDataReader().next();
      String result = null;
      try {
         result = this.getString("getM1StringResult");
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

   public int getM2Result() {
      this.setTestTarget("testM2");
      this.getDataReader().next();
      int result = 0;
      try {
         result = this.getInt("getM2Result");
      } catch (EmptyDataReaderException e) {
         System.out.println("Error in getM2Result");
         System.out.println(e.getMessage());
         System.exit(0);
      }
      return result;
   }

}

