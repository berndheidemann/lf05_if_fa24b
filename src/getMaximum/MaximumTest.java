package getMaximum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTest {

    @ParameterizedTest(name = "number1={0}, number2={1}, number3={2}")
    @CsvSource(value = {"1, 2, 3", "3, 2, 1", "2, 3, 1", "1, 3, 2"})
    public void givenThreeNumbersInAnyOrder_WhenGetMaximum_ReturnBiggestNumber(int number1, int number2, int number3){
        Maximum calc = new Maximum();
        assertEquals(3, calc.getMaximum(number1, number2, number3));
    }
}
