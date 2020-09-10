package discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalcTest {

    @Test
    public void given2000_whencalc_ThenReturn1800() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(1800, discount.calc(2000));
    }

    @Test
    public void given300_whencalc_ThenReturn300() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(300, discount.calc(300));
    }

    @Test
    public void given3000_whencalc_ThenReturn2700() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(3000, discount.calc(2700));
    }
}
