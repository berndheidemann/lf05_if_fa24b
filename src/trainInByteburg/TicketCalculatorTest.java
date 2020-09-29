package trainInByteburg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketCalculatorTest {
    private TicketCalculator calc;

    @BeforeEach
    public void setUp(){
        this.calc = new TicketCalculator();
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"11, 12", "12, 11", "43, 53", "53, 43", "13, 53", "53, 13", "00, 41", "31, 00", "33, 34", "24, 23"})
    public void givenShort_WhenCalculateTicketprice_ThenReturn1(int start, int exit){
        assertEquals(1, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"32, 34", "25, 22", "13, 15", "55, 53", "51, 14"})
    public void givenOneZoneBoundaryExceeded_WhenCalculateTicketprice_ThenReturn3(int start, int exit){
        assertEquals(3, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"45, 14", "34, 55"})
    public void givenTwoZoneBoundaryExceeded_WhenCalculateTicketprice_ThenReturn3(int start, int exit){
        assertEquals(4, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"55, 56", "26, 25"})
    public void givenOneFinalDestinationUsedInShortCase_WhenCalculateTicketprice_ThenReturn1(int start, int exit) {
        assertEquals(1, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"16, 14", "44, 46"})
    public void givenOneFinalDestinationUsedInNormalCase_WhenCalculateTicketprice_ThenReturn3(int start, int exit){
        assertEquals(3, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"36, 32", "11, 16", "43, 16", "56, 21"})
    public void givenOneFinalDestinationUsedWithOneZoneBoundaryExceeded_WhenCalculateTicketprice_ThenReturn4(int start, int exit){
        assertEquals(4, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"46, 14", "34, 56"})
    public void givenOneFinalDestinationUsedWithTwoZoneBoundaryExceeded_WhenCalculateTicketprice_ThenReturn5(int start, int exit){
        assertEquals(5, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"46, 16", "36, 56"})
    public void givenTwoFinalDestinationUsed_WhenCalculateTicketprice_ThenReturn6(int start, int exit){
        assertEquals(6, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"11, 13", "33, 31", "33, 53", "43, 13"})
    public void givenNormalTripWithoutSurcharges_WhenCalculateTicketprice_ThenReturn2(int start, int exit){
        assertEquals(2, this.calc.calculateTicketprice(start, exit));
    }

    @ParameterizedTest(name = "start={0}, exit={1}")
    @CsvSource(value = {"11, 66", "37, 31", "-1, 53", "713, 13"})
    public void givenWrongStation_WhenCalculateTicketprice_ThenReturnMinusOne(int start, int exit){
        assertEquals(-1, this.calc.calculateTicketprice(start, exit));
    }


}
