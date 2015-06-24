package package2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import package2.Class3;
import package2._dataReaders.Class3TestDataReader;

public class Class3Test {

   private static Class3TestDataReader data;

   @BeforeClass
   public static void init() {
         data = new Class3TestDataReader();
   }

   @After
   public void reset() {
      data.reset();
   }

   @Test
   public void testClass3() {
      while (data.hasNext("Class3")) {
         Class3 class3 = data.getClass3();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testClass3Boolean() {
      while (data.hasNext("Class3Boolean")) {
         Class3 class3 = data.getClass3();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testIsValue() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getIsValueResult(), data.getClass3().isValue());
      }
   }

   @Test
   public void testM3Boolean() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM3BooleanResult(), data.getClass3().m3(data.getM3BooleanParameter0()));
      }
   }

}

