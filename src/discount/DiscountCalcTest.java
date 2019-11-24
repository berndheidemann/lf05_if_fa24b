package discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalcTest {

    @Test
    public void given_2000_when_calc_Then_1800() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(1800, discount.calc(2000));
    }

    @Test
    public void given_300_when_calc_Then_300() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(300, discount.calc(300));
    }

    @Test
    public void given_3000_when_calc_Then_2700() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(3000, discount.calc(2700));
    }
}
