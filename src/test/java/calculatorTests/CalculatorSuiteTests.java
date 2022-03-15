package calculatorTests;

import categories.Basic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory({Basic.class})
@Suite.SuiteClasses({
        CalculatorParametrizedTest.class,
        CalculatorSimpleTest.class
})
public class CalculatorSuiteTests {
}
