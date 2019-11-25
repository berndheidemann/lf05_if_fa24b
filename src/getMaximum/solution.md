**Lösung Maximum**

```
public class Maximum{
    public int getMaximum(int number1, int number2, int number3){
        if (number1>number2){
            if (number1>number3)
                return number1;
            else
                return number3;
        }
        else{
            if (number2>number3)
                return number2;
            else
                return number3;
        }
    }
}

package getMaximum;
import java.util.Scanner;

public class MaximumUI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Erste Zahl: ");
        int zahl1 = sc.nextInt();
        System.out.print("Zweite Zahl: ");
        int zahl2 = sc.nextInt();
        System.out.print("Dritte Zahl: ");
        int zahl3 = sc.nextInt();
        Maximum max = new Maximum();
        int result = max.getMaximum(zahl1, zahl2, zahl3);
        System.out.print("Maximum: "+ result);
        sc.close();
    }
}
```