import calculatorApp.Calculator;
import org.junit.*;
import static org.junit.Assert.*;
public class CalculatorTests {
    private static final double DELTA = 1e-15;
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testForAddition()
    {
        double num1=2;
        double num2 = 5;
        double expectedResult = 7;
        double result = calc.add(num1,num2);
        assertEquals(expectedResult,result,DELTA);
    }

    @Test

    public void testForSubstraction()
    {
        double num1=9;
        double num2 = 2;
        double expectedResult = 7;
        double result = calc.substract(num1,num2);
        assertEquals(expectedResult,result,DELTA);
    }

    @Test
    public void testForMultiplication()
    {
        double num1=2;
        double num2 = 15;
        double expectedResult = 30;
        double result = calc.multiply(num1,num2);
        assertEquals(expectedResult,result,DELTA);
    }

    @Test
    public void testForDivision()
    {
        double num1=14;
        double num2 = 2;
        double expectedResult = 7;
        double result = calc.divide(num1,num2);
        assertEquals(expectedResult,result,DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero(){
        double num1=14;
        double num2=0;
        calc.divide(num1,num2);
    }
}
