package calculatorTests;

import junit.framework.TestCase;
import org.junit.*;

import java.time.LocalTime;

public class CalculatorHooksTest {
    @BeforeClass
    public static void preconditionForClass() {
        System.out.println("Test class is started in " + LocalTime.now());
    }

    @AfterClass
    public static void postConditionForClass() {
        System.out.println("Test class is ended in " + LocalTime.now());
    }

    @Before
    public void preconditionForTest() {
        System.out.println("Test case started in " + LocalTime.now());
    }

    @After
    public void postConditionForTest() {
        System.out.println("Test case ended in " + LocalTime.now());
    }

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
    public void simpleTimeoutTest() throws InterruptedException {
        Thread.sleep(999);
    }
}
