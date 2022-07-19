import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalc {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition(){
        assertEquals(7, calculator.addition(3,4));
    }

    @Test
    public void testSubtraction(){
        assertEquals(5, calculator.subtraction(15, 10));
    }

    @Test
    public void testMultiplication(){
        assertEquals(15, calculator.multiplication(3, 5));
    }

    @Test
    public void testDivision(){
        assertEquals(2.0, calculator.division(10.0, 5.0), 0);
    }
}
