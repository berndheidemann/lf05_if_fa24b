package dateValidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class DateValidatorTest {
    private DateValidator validator;

    @BeforeEach
    public void setUp(){
        validator = new DateValidator();
    }

    @ParameterizedTest(name = "day={0}, month={1}, year={2}")
    @CsvSource(value = {"0, 12, 2019", "32, 12, 2019", "1, 13, 2019", "1, -3, 2019"})
    public void givenWrongDayOrMonth_WhenValidateDate_ThenReturnFalse(int day, int month, int year){
        assertFalse(validator.validateDate(day, month, year));
    }

    @ParameterizedTest(name = "day={0}, month={1}, year={2}")
    @CsvSource(value = {"31, 1, 2019", "1, 3, 2019", "31, 5, 2019", "31, 7, 2019", "31, 8, 2000", "31, 10, 2010", "31, 12, 2000"})
    public void givenMonthWith31Days_WhenValidateDate_ThenReturnTrue(int day, int month, int year){
        assertTrue(validator.validateDate(day, month, year));
    }

    @ParameterizedTest(name = "day={0}, month={1}, year={2}")
    @CsvSource(value = {"30, 4, 2019", "30, 6, 2019", "30, 9, 2019", "30, 11, 2019"})
    public void givenMonthWith30Days_WhenValidateDate_ThenReturnTrue(int day, int month, int year){
        assertTrue(validator.validateDate(day, month, year));
    }

    @Test
    public void givenMonthWith30DaysButDayIs31_WhenValidateDate_ThenReturnFalse(){
        assertFalse(validator.validateDate(31, 4, 2019));
    }

    @ParameterizedTest(name = "day={0}, month={1}, year={2}")
    @CsvSource(value = {"29, 2, 2004", "29, 2, 2000"})
    public void givenLeapYearAndDayIs29_WhenValidateDate_ThenReturnTrue(int day, int month, int year){
        assertTrue(validator.validateDate(day, month, year));
    }

    @ParameterizedTest(name = "day={0}, month={1}, year={2}")
    @CsvSource(value = {"30, 2, 2004", "31, 2, 2000", "30, 2, 2000"})
    public void givenLeapYearAndDayIsAbove29_WhenValidateDate_ThenReturnFalse(int day, int month, int year){
        assertFalse(validator.validateDate(day, month, year));
    }

    @Test
    public void givenYearIsDivisibleBy4And100ButNot400AndDayIs29_WhenValidateDate_ThenReturnFalse(){
        assertFalse(validator.validateDate(29, 2, 1900));
    }

    @ParameterizedTest(name = "day={0}, month={1}, year={2}")
    @CsvSource(value = {"29, 2, 2018", "29, 2, 1900"})
    public void givenNonLeapYearAndDayIsAbove28_WhenValidateDate_ThenReturnFalse(int day, int month, int year){
        assertFalse(validator.validateDate(day, month, year));
    }

    @ParameterizedTest(name = "day={0}, month={1}, year={2}")
    @CsvSource(value = {"28, 2, 2019", "28, 2, 1900"})
    public void givenNonLeapYearWithDayRigthDay_WhenValidateDate_ThenReturnTrue(int day, int month, int year){
        assertTrue(validator.validateDate(day, month, year));
    }

}
