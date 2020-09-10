###Lösung Reifendruck

```
 public boolean calc(int frontRight, int frontLeft, int behindRight, int behindLeft) {
        if (Math.abs(frontRight - frontLeft) <= 3 && Math.abs(behindRight - behindLeft) <= 3) {
            return true;
        }
        return false;    }


    public boolean checkTyre(int pressure) {
        if (pressure >= 35 && pressure <= 45) {
            return true;
        }
        return false;
    }
```