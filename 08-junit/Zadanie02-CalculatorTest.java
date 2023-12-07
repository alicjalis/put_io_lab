package put.io.testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(10, calculator.add(-2, 12), "-2 + 12 should equal 10");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-24, calculator.multiply(-2, 12), "-2 * 12 should equal -24");
    }

    @Test
    public void testAddPositiveNumbers() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.addPositiveNumbers(-2, 3);
        }, "Expected addPositiveNumbers() to throw, but it didn't");
    }
}
