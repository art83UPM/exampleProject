package package1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import package1.Class1;
import package1._dataReaders.Class1TestDataReader;

public class Class1Test {

   private static Class1TestDataReader data;

   @BeforeClass
   public static void init() {
         data = new Class1TestDataReader();
   }

   @After
   public void reset() {
      data.reset();
   }

   @Test
   public void testClass1IntInt() {
      while (data.hasNext("Class1IntInt")) {
         Class1 class1 = data.getClass1();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testClass1Int() {
      while (data.hasNext("Class1Int")) {
         Class1 class1 = data.getClass1();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testClass1() {
      while (data.hasNext("Class1")) {
         Class1 class1 = data.getClass1();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testToString() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getToStringResult(), data.getClass1().toString());
      }
   }

   @Test
   public void testM1Boolean() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1BooleanResult(), data.getClass1().m1(data.getM1BooleanParameter0()));
      }
   }

   @Test
   public void testM1String() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1StringResult(), data.getClass1().m1(data.getM1StringParameter0()));
      }
   }

   @Test
   public void testM1IntInt() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1IntIntResult(), data.getClass1().m1(data.getM1IntIntParameter0(),data.getM1IntIntParameter1()));
      }
   }

   @Test
   public void testM1Float() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1FloatResult(), data.getClass1().m1(data.getM1FloatParameter0()));
      }
   }

   @Test
   public void testM1Double() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1DoubleResult(), data.getClass1().m1(data.getM1DoubleParameter0()));
      }
   }

   @Test
   public void testM1() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1Result(), data.getClass1().m1());
      }
   }

   @Test
   public void testM1Int() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1IntResult(), data.getClass1().m1(data.getM1IntParameter0()));
      }
   }

}

