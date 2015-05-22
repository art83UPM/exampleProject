package spike;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import spike._dataReaders.ExampleTestDataReader;

public class ExampleTest {

    private static ExampleTestDataReader data;

    @BeforeClass
    public static void init() {
        data = new ExampleTestDataReader();
    }

//    @After
//    public void reset() {
//        data.reset();
//    }

    @Test
    public void testExample() {
        data.setTestTarget("Constructors");
        while (data.hasNext(0)) {
            data.next();
            Example example = data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testExampleInt() {
        data.setTestTarget("Constructors");
        while (data.hasNext(1)) {
            data.next();
            Example example = data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testExampleIntInt() {
        data.setTestTarget("Constructors");
        while (data.hasNext(2)) {
            data.next();
            data.getExample();
            fail("Not yet implemented");
        }
    }

    @Test
    public void testM1() {
        data.setTestTarget("m1");
        while (data.hasNext()) {
            data.next();
            assertEquals("Testing row: " + data.getCurrentRow(), data.getM1Result(), data.getExample().m1());
        }
    }

    @Test
    public void testM1Int() {
        data.setTestTarget("m1Int");
        while (data.hasNext()) {
            data.next();
            assertEquals("Testing row: " + data.getCurrentRow(), data.getM1IntResult(), data.getExample().m1(data.getM1IntX()));
        }
    }

    @Test
    public void testM1Float() {
        data.setTestTarget("m1Float");
        while (data.hasNext()) {
            data.next();
            assertEquals("Testing row: " + data.getCurrentRow(), data.getM1FloatResult(), data.getExample().m1(data.getM1FloatX()));
        }
    }

    @Test
    public void testM1Double() {
        data.setTestTarget("m1Double");
        while (data.hasNext()) {
            data.next();
            assertEquals("Testing row: " + data.getCurrentRow(), data.getM1DoubleResult(), data.getExample().m1(data.getM1DoubleX()));
        }
    }

    @Test
    public void testM1Boolean() {
        data.setTestTarget("m1Boolean");
        while (data.hasNext()) {
            data.next();
            assertEquals("Testing row: " + data.getCurrentRow(), data.getM1BooleanResult(), data.getExample().m1(data.getM1BooleanX()));
        }
    }

    @Test
    public void testM1String() {
        data.setTestTarget("m1String");
        while (data.hasNext()) {
            data.next();
            assertEquals("Testing row: " + data.getCurrentRow(), data.getM1StringResult(), data.getExample().m1(data.getM1StringX()));
        }
    }

    @Test
    public void testM1IntInt() {
        data.setTestTarget("m1IntInt");
        while (data.hasNext()) {
            data.next();
            assertEquals("Testing row: " + data.getCurrentRow(), data.getM1IntIntResult(), data.getExample().m1(data.getM1IntIntX(), data.getM1IntIntY()));
        }
    }

}
