###Lösung Rabattberechnung

```
public int calc(int amount) {
        if (amount > 1000) {
            int discount = amount * 10 / 100;
            return amount - discount;
        } else {
            return amount;
        }
    }
```