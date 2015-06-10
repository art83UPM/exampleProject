package spike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import spike._dataReaders.ExampleTestDataReaderByHand;

public class ExampleTestByHand {
	// NOT UPDATED TO THE LAST VERSION
    private static ExampleTestDataReaderByHand data;

    @BeforeClass
    public static void init() {
        data = new ExampleTestDataReaderByHand();
    }

    @After
    public void reset() {
        data.reset();
    }

    @Test
    public void testExample() {
        while (data.hasNext(0)) {
            Example example = data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testExampleInt() {
        while (data.hasNext(1)) {
            Example example = data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testExampleIntInt() {
        while (data.hasNext(2)) {
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
            assertEquals(data.getLocationMessage(), data.getM1IntResult(), data.getExample().m1(data.getM1IntX()));
        }
    }

    @Test
    public void testM1Float() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1FloatResult(), data.getExample().m1(data.getM1FloatX()));
        }
    }

    @Test
    public void testM1Double() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1DoubleResult(), data.getExample().m1(data.getM1DoubleX()));
        }
    }

    @Test
    public void testM1Boolean() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1BooleanResult(), data.getExample().m1(data.getM1BooleanX()));
        }
    }

    @Test
    public void testM1String() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1StringResult(), data.getExample().m1(data.getM1StringX()));
        }
    }

    @Test
    public void testM1IntInt() {
        while (data.hasNext()) {
            data.next();
            assertEquals(data.getLocationMessage(), data.getM1IntIntResult(), data.getExample().m1(data.getM1IntIntX(), data.getM1IntIntY()));
        }
    }

}
