package discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalcTest {

    @Test
    public void given_2000_when_calc_Then_1800() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(1800, discount.calc(2000));
    }
}
