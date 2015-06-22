package spike;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import package1.Class1;
import spike._dataReaders.ExampleTestDataReader;

public class ExampleTest {

   private static ExampleTestDataReader data;

   @BeforeClass
   public static void init() {
         data = new ExampleTestDataReader();
   }

   @After
   public void reset() {
      data.reset();
   }

   @Test
   public void testExampleIntInt() {
      while (data.hasNext(2)) {
         Class1 example = data.getExample();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testExampleInt() {
      while (data.hasNext(1)) {
         Class1 example = data.getExample();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testExample() {
      while (data.hasNext(0)) {
         Class1 example = data.getExample();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testToString() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getToStringResult(), data.getExample().toString());
      }
   }

   @Test
   public void testM1Boolean() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1BooleanResult(), data.getExample().m1(data.getM1BooleanParameter0()));
      }
   }

   @Test
   public void testM1String() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1StringResult(), data.getExample().m1(data.getM1StringParameter0()));
      }
   }

   @Test
   public void testM1IntInt() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1IntIntResult(), data.getExample().m1(data.getM1IntIntParameter0(),data.getM1IntIntParameter1()));
      }
   }

   @Test
   public void testM1Float() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1FloatResult(), data.getExample().m1(data.getM1FloatParameter0()));
      }
   }

   @Test
   public void testM1Double() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1DoubleResult(), data.getExample().m1(data.getM1DoubleParameter0()));
      }
   }

   @Test
   public void testM1() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1Result(), data.getExample().m1());
      }
   }

   @Test
   public void testM1Int() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1IntResult(), data.getExample().m1(data.getM1IntParameter0()));
      }
   }

}

