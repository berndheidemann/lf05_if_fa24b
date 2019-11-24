package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void GivenOperatorPlus_WhenCalculate_ThenReturnRightSummationString(){
        assertEquals("3.0 + 5.5 = 8.5", calc.calculate(3.0,5.5, '+'));
    }

    @Test
    public void GivenOperatorMinus_WhenCalculate_ThenReturnRightSubractionString(){
        assertEquals("5.5 - 3.5 = 2.0", calc.calculate(5.5,3.5, '-'));
    }

    @Test
    public void GivenOperatorMultiplication_WhenCalculate_ThenReturnRightMultiplicationString(){
        assertEquals("5.5 x 3.5 = 19.25", calc.calculate(5.5,3.5, '*'));
    }

    @Test
    public void GivenOperatorDivision_WhenCalculate_ThenReturnRightMultiplicationString(){
        assertEquals("9.0 : 3.0 = 3.0", calc.calculate(9.0,3.0, '/'));
    }

    @Test
    public void GivenOperatorDivisionNumber2EqualsZero_WhenCalculate_ThenReturnErrorString(){
        assertEquals("Division durch 0 nicht möglich!", calc.calculate(9.0,0.0, '/'));
    }

    @Test
    public void GivenWrongOperator_WhenCalculate_ThenReturnErrorString(){
        assertEquals("Sie müssen einen der vier Operatoren +,-,*,/ eingeben!", calc.calculate(9.0,8.0, '§'));
    }
}