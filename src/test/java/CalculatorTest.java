import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public static void initClass(){
        System.out.println("The tests are beginning");
    }
    @AfterClass
    public static void finishTest(){
        System.out.println("The tests finished");
    }
    @Before
    public void initCalculate(){
        calculator = new Calculator();
    }
    @After
    public void afterTest(){
        calculator = null;
    }

    @Test
    public void summa() {
        assertEquals(17, calculator.summa(8,9), 1e-9);
    }

    @Test
    public void summa1() {
        assertEquals(17,calculator.summa(5.9, 11.1), 1e-9);
    }

    @Test
    public void multiplate() {
        assertEquals(16, calculator.multiplate(2,8),1e-9);
    }

    @Test
    public void multiplate1() {
        assertEquals(16,calculator.multiplate(32,0.5),1e-9);
    }
    @Test
    public void multiplate2() {
        assertEquals(0.05,calculator.multiplate(0.1,0.5),1e-9);
    }


    @Test(expected = ArithmeticException.class)
    public void getdivision() {
        calculator.getdivision(9,0);
    }

    @Test(expected = ArithmeticException.class)
    public void getdivisionByZero() {
        calculator.getdivision(8.1,0);
    }
    @Test
    public void getdivision1() {

        assertEquals(3.8571428571428568, calculator.getdivision(8.1,2.1),1e-9);
    }
}