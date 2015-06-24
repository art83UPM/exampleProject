package package1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import package1.Class2;
import package1._dataReaders.Class2TestDataReader;

public class Class2Test {

   private static Class2TestDataReader data;

   @BeforeClass
   public static void init() {
         data = new Class2TestDataReader();
   }

   @After
   public void reset() {
      data.reset();
   }

   @Test
   public void testClass2() {
      while (data.hasNext("Class2")) {
         Class2 class2 = data.getClass2();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testClass2String() {
      while (data.hasNext("Class2String")) {
         Class2 class2 = data.getClass2();
         fail("Not yet implemented");
      }
   }

   @Test
   public void testGetString() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getGetStringResult(), data.getClass2().getString());
      }
   }

   @Test
   public void testSetStringString() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getSetStringStringResult(), data.getClass2().setString(data.getSetStringStringParameter0()));
      }
   }

   @Test
   public void testM2() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM2Result(), data.getClass2().m2());
      }
   }

   @Test
   public void testM1Int() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1IntResult(), data.getClass2().m1(data.getM1IntParameter0()));
      }
   }

   @Test
   public void testM1String() {
      while (data.hasNext()) {
         data.next();
         assertEquals(data.getM1StringResult(), data.getClass2().m1(data.getM1StringParameter0()));
      }
   }

}

