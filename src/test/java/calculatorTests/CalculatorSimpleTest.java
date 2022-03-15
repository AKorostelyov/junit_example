package calculatorTests;

import categories.Basic;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Basic.class)
public class CalculatorSimpleTest {

    @Test
    public void simpleTest() {
        Calculator calculator = new Calculator();
        TestCase.assertEquals(3.0, calculator.executeOperation(1, 2, "+"));
    }

    @Test(expected = ArithmeticException.class)
    public void simpleNegativeTest() {
        Calculator calculator = new Calculator();
        calculator.executeOperation(3, 0, "/");
    }

    @Test(timeout = 1000)
    @Category(Basic.class)
    public void simpleTimeoutTest() throws InterruptedException {
        Thread.sleep(999);
    }

    @Ignore
    @Test
    public void simpleIgnoredTest() {
        Object obj = new Object();
        TestCase.assertNotNull(obj);
    }
}
