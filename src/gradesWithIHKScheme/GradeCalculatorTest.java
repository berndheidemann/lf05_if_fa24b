package gradesWithIHKScheme;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {
    private GradeCalculator calc;

    @BeforeEach
    public void setUp(){
        calc = new GradeCalculator();
    }

    @ParameterizedTest(name = "points={0}, reachablePoints={1}")
    @CsvSource(value = {"0, 100", "73.5, 250", "15, 100"})
    public void givenPercentBetween0And30_WhenCalculateGrade_ThenReturn6(double points , int reachablePoints){
        assertEquals(6, calc.calculateGrade(points, reachablePoints));
    }

    @ParameterizedTest(name = "points={0}, reachablePoints={1}")
    @CsvSource(value = {"29.5, 100", "90, 200", "123.5, 250"})
    public void givenPercentBetween30And50_WhenCalculateGrade_ThenReturn5(double points , int reachablePoints){
        assertEquals(5, calc.calculateGrade(points, reachablePoints));
    }

    @ParameterizedTest(name = "points={0}, reachablePoints={1}")
    @CsvSource(value = {"166, 250", "110, 200", "49.5, 100"})
    public void givenPercentBetween50And67_WhenCalculateGrade_ThenReturn4(double points , int reachablePoints){
        assertEquals(4, calc.calculateGrade(points, reachablePoints));
    }

    @ParameterizedTest(name = "points={0}, reachablePoints={1}")
    @CsvSource(value = {"166.5, 250", "175, 250", "201, 250"})
    public void givenPercentBetween67And81_WhenCalculateGrade_ThenReturn3(double points , int reachablePoints){
        assertEquals(3, calc.calculateGrade(points, reachablePoints));
    }

    @ParameterizedTest(name = "points={0}, reachablePoints={1}")
    @CsvSource(value = {"201.5, 250", "210, 250", "228.5, 250"})
    public void givenPercentBetween81And92_WhenCalculateGrade_ThenReturn2(double points , int reachablePoints){
        assertEquals(2, calc.calculateGrade(points, reachablePoints));
    }

    @ParameterizedTest(name = "points={0}, reachablePoints={1}")
    @CsvSource(value = {"229, 250", "240, 250", "250, 250"})
    public void givenPercentBetween92And100_WhenCalculateGrade_ThenReturn1(double points , int reachablePoints){
        assertEquals(1, calc.calculateGrade(points, reachablePoints));
    }

    @Test
    public void givenPointsBiggerThanReachablePoints_WhenCalculateGrade_ThenReturnMinus1(){
        assertEquals(-1, calc.calculateGrade(101, 100));
    }
}
