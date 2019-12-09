###Lösung Death Valley

```
public class Tank {
    public boolean enoughGas(int capacity, int gasDisplay, double consumption){
        double gallons, reach;
        gallons = capacity/100.0 * gasDisplay;
        reach = gallons * consumption;

        if (reach >= 200){
            return true;
        }
        else{
            return false;
        }
    }
}
```

```
import java.util.Scanner;

public class DeathValleyUI {
    public static void main(String [] args) {

        int capacity, percent, milesPerGallon;
        Scanner sc = new Scanner(System.in);
        Tank myTank = new Tank();

        System.out.print("Tankkapazität: ");
        capacity = sc.nextInt();
        System.out.print("Benzinanzeige: ");
        percent = sc.nextInt();
        System.out.print("Meilen pro Gallone: ");
        milesPerGallon = sc.nextInt();

        if (myTank.enoughGas(capacity, percent, milesPerGallon) ){
            System.out.println("Weiterfahren!");
        }
        else{
            System.out.println("Tanken!");
        }
    }
}
```