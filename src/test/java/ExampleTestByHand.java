

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import package1.Class1;

public class ExampleTestByHand {
	// NOT UPDATED TO THE LAST VERSION
    private static ExampleTestDataReaderByHand data;
//	private static ExampleTestDataReader data;

    @BeforeClass
    public static void init() {
        data = new ExampleTestDataReaderByHand();
//    	data = new ExampleTestDataReader();
    }

    @After
    public void reset() {
        data.reset();
    }

    @Test
    public void testExample() {
        while (data.hasNext("Example")) {
            Example example = data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testExampleInt() {
        while (data.hasNext("ExampleInt")) {
            Example example = data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testExampleIntInt() {
        while (data.hasNext("ExapleIntInt")) {
            data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testM1() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1Result(), data.getExample().m1());
        }
    }

    @Test
    public void testM1Int() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1IntResult(), data.getExample().m1(data.getM1IntParameter0()));
        }
    }

    @Test
    public void testM1Float() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1FloatResult(), data.getExample().m1(data.getM1FloatParameter0()));
        }
    }

    @Test
    public void testM1Double() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1DoubleResult(), data.getExample().m1(data.getM1DoubleParameter0()));
        }
    }

    @Test
    public void testM1Boolean() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1BooleanResult(), data.getExample().m1(data.getM1BooleanParameter0()));
        }
    }

    @Test
    public void testM1String() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1StringResult(), data.getExample().m1(data.getM1StringParameter0()));
        }
    }

    @Test
    public void testM1IntInt() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1IntIntResult(), data.getExample().m1(data.getM1IntIntParameter0(), data.getM1IntIntParameter0()));
        }
    }

}
