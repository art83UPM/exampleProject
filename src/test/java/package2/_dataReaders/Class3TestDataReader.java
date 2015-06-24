package package2._dataReaders;

import readers.TestDataReader;
import readers.exceptions.EmptyDataReaderException;
import readers.exceptions.InvalidDataReaderException;
import package2.Class3;

public class Class3TestDataReader extends TestDataReader {

   private Class3 class3;

   private final static String[] CONSTRUCTOR_NAMES = {"Class3", "Class3Boolean"};

   public Class3TestDataReader() {
      super("C:\\Users\\CarlosDavid\\git\\exampleProject\\src\\test\\resources\\package2\\Class3TestData.xlsx");
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
      this.class3= null;
      while (i < CONSTRUCTOR_NAMES.length && !this.existsConstructor(CONSTRUCTOR_NAMES[i])) {
         i++;
      }
      this.construct(CONSTRUCTOR_NAMES[i]);
   }

   public void next(String constructorName) {
      this.class3= null;
      this.construct(constructorName);
   }

   private boolean existsConstructor(String constructorName) {
      switch (constructorName) {
      case "Class3":
         return existsConstructorClass3();

      case "Class3Boolean":
         return existsConstructorClass3Boolean();

      default:
         return false;
      }
   }

   private void construct(String constructorName) {
      switch (constructorName) {
      case "Class3":
         constructClass3();
         break;

      case "Class3Boolean":
         constructClass3Boolean();
         break;

      }
   }

   public Class3 getClass3() {
      return this.class3;
   }

   private boolean existsConstructorClass3() {
      try {
         String x = this.getString("getClass3");
         if (!x.equalsIgnoreCase("x")) {
            throw new InvalidDataReaderException("Data under column \"getClass3\" at row: "+ this.getDataReader().getRow()+ " should be x or X");
         }
      } catch (InvalidDataReaderException e) {
         System.out.println(e.getMessage());
         System.exit(0);
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructClass3() {
      this.class3= new Class3();
   }

   private boolean existsConstructorClass3Boolean() {
      try {
         this.getInt("getClass3BooleanParameter0");
      } catch (EmptyDataReaderException e) {
         return false;
      }
      return true;
   }

   private void constructClass3Boolean() {
      try {
         boolean Class3BooleanParameter0 = this.getBoolean("getClass3BooleanParameter0");
      this.class3= new Class3(Class3BooleanParameter0);
      } catch (EmptyDataReaderException e) {}
   }

   public boolean getIsValueResult() {
      this.setTestTarget("testIsValue");
      this.getDataReader().next();
      boolean result = false;
      try {
         result = this.getBoolean("getIsValueResult");
      } catch (EmptyDataReaderException e) {
         System.out.println("Error in getIsValueResult");
         System.out.println(e.getMessage());
         System.exit(0);
      }
      return result;
   }

   public boolean getM3BooleanResult() {
      this.setTestTarget("testM3Boolean");
      this.getDataReader().next();
      boolean result = false;
      try {
         result = this.getBoolean("getM3BooleanResult");
      } catch (EmptyDataReaderException e) {
         System.out.println("Error in getM3BooleanResult");
         System.out.println(e.getMessage());
         System.exit(0);
      }
      return result;
   }

   public boolean getM3BooleanParameter0() {
      this.setTestTarget("testM3Boolean");
      boolean result = false;
      try {
         result = this.getBoolean("getM3BooleanParameter0");
      } catch (EmptyDataReaderException e) {
         System.out.println("Error in getM3BooleanParameter0");
         System.out.println(e.getMessage());
         System.exit(0);
      }
      return result;
   }

}

