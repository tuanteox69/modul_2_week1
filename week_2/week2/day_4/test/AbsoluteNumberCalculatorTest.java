import absolute_number_calculator.AbsoluteNumberCalculator;
import org.junit.jupiter.api.Test;

import static absolute_number_calculator.AbsoluteNumberCalculator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result =
                AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = findAbsolute(number);
        assertEquals(expected, result);
    }
}
