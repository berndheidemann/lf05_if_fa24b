package discount;

public class DiscountCalc {
    // amount in Cent
    public int calc(int amount) {
        if (amount>1000) {
            return amount*90/100;  // 10% wird abgezogen
        } else {
            return amount;     // hier wird gar nichts abgezogen
        }
    }
}
