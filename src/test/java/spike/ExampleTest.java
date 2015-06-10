package spike;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import spike.Example;
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
      while (data.hasNext(0)) {
         Example example = data.getExample();
         fail("Not yet implemented");
         data.next();
      }
   }

   @Test
   public void testExampleInt() {
      while (data.hasNext(1)) {
         Example example = data.getExample();
         fail("Not yet implemented");
         data.next();
      }
   }

   @Test
   public void testExample() {
      while (data.hasNext(2)) {
         Example example = data.getExample();
         fail("Not yet implemented");
         data.next();
      }
   }

   @Test
   public void testToString() {
      while (data.hasNext()) {
         assertEquals(data.getToStringResult(), data.getExample().toString());
         data.next();
      }
   }

   @Test
   public void testM1Boolean() {
      while (data.hasNext()) {
         assertEquals(data.getM1BooleanResult(), 
        		 data.getExample()
        		 .m1(data.getM1BooleanParameter0()));
         data.next();
      }
   }

   @Test
   public void testM1String() {
      while (data.hasNext()) {
         assertEquals(data.getM1StringResult(), data.getExample().m1(data.getM1StringParameter0()));
         data.next();
      }
   }

   @Test
   public void testM1IntInt() {
      while (data.hasNext()) {
         assertEquals(data.getM1IntIntResult(), data.getExample().m1(data.getM1IntIntParameter0(),data.getM1IntIntParameter1()));
         data.next();
      }
   }

   @Test
   public void testM1Float() {
      while (data.hasNext()) {
         assertEquals(data.getM1FloatResult(), data.getExample().m1(data.getM1FloatParameter0()));
         data.next();
      }
   }

   @Test
   public void testM1Double() {
      while (data.hasNext()) {
         assertEquals(data.getM1DoubleResult(), data.getExample().m1(data.getM1DoubleParameter0()));
         data.next();
      }
   }

   @Test
   public void testM1() {
      while (data.hasNext()) {
         assertEquals(data.getM1Result(), data.getExample().m1());
         data.next();
      }
   }

   @Test
   public void testM1Int() {
      while (data.hasNext()) {
         assertEquals(data.getM1IntResult(), data.getExample().m1(data.getM1IntParameter0()));
         data.next();
      }
   }

}

