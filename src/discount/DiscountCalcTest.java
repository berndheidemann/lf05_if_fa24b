package discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalcTest {

    @Test
    public void given2000_whenCalc_ThenReturn1800() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(1800, discount.calc(2000));
    }

    @Test
    public void given300_whenCalc_ThenReturn300() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(300, discount.calc(300));
    }

    @Test
    public void given1000_whenCalc_ThenReturn1000() {
        DiscountCalc discount=new DiscountCalc();
        assertEquals(1000, discount.calc(1000));
    }
}
