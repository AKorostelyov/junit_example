package calculatorTests;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorParametrizedTest {
    private static Calculator calculator;
    @Parameter
    public String oper1;
    @Parameter(1)
    public String oper2;
    @Parameter(2)
    public String operation;
    @Parameter(3)
    public String expected;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void exitMessage() {
        System.out.println("That`s all, folks");
    }

    @Parameters(name = "calculatorTest: {0} {2} {1} = {3}")
    public static Collection<Object[]> setData() {
        return Arrays.asList(new Object[][]{
                {"1", "2", "+", "3.0"},
                {"2", "5", "-", "-3.0"},
                {"3", "3", "-", "0.0"}
        });
    }

    @Test
    public void operationShouldBeCorrect() {
        TestCase.assertEquals(Double.valueOf(this.expected),
                calculator.executeOperation(
                        Double.parseDouble(this.oper1),
                        Double.parseDouble(this.oper2),
                        this.operation)
        );
    }
}
