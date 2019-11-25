**Lösung IHK-Schema**

```
public int calculateGrade(double points, int reachablePoints){
        double percent;
        int result;
        if(points > reachablePoints){
            return -1;
        }
        percent = points/reachablePoints*100;
        System.out.println(percent);
        percent = Math.round(percent);
        System.out.println(percent);
        if (percent < 30) {
            result = 6;
        }
        else if (percent < 50) {
            result = 5;
        }
        else if (percent < 67) {
            result = 4;
        }
        else if (percent < 81) {
            result = 3;
        }
        else if (percent < 92) {
            result = 2;
        }
        else {
            result = 1;
        }
        return result;
    }
```