package median;

import getMaximum.Maximum;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianTest {
    @ParameterizedTest(name = "number1={0}, number2={1}, number3={2}")
    @CsvSource(value = {"1, 2, 3", "1, 3, 2", "2, 1, 3", "3, 1, 2", "2, 3, 1", "3, 2, 1"})
    public void givenThreeNumbersInAnyOrder_WhenGetMedian_ReturnMedian(int number1, int number2, int number3){
        Median calc = new Median();
        assertEquals(2, calc.getMedian(number1, number2, number3));
    }
}
