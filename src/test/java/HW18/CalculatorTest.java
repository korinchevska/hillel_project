package HW18;
import org.testng.annotations.*;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
        System.out.println("BeforeClass");

    }
    @AfterClass
    public void tearDown() {
        calculator = null;
        System.out.println("AfterClass");

    }
    @Test(priority = 1, description = "Checking the addition")
    public void testAddition() {
        double result = calculator.add(10, 5);
        System.out.println("Addition result: " + result);
        assert result == 15.0;
    }

    @Test(priority = 2, description = "Checking subtraction")
    public void testSubtraction() {
        double result = calculator.subtract(10, 5);
        System.out.println("Subtraction result: " + result);
        assert result == 5.0;
    }

    @Test(priority = 3, description = "Multiplication checking")
    public void testMultiplication() {
        double result = calculator.multiply(10, 5);
        System.out.println("Multiplication result: " + result);
        assert result == 50.0;
    }

  @Test(priority = 4, description = "Checking the division")
    public void testDivision() {
        double result = calculator.divide(10, 5);
        System.out.println("Division result: " + result);
        assert result == 2.0;
    }

    @Test(priority = 5, description = "Checking division by zero", expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }



}

