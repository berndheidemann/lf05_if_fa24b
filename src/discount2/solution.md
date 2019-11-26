###Lösung Versandhandel

```
public class Discount {
    public double calculateInvoiceAmount(double orderAmount, double postage, double packaging){
        if (orderAmount >= 500){
            orderAmount = orderAmount *0.95;
        }
        return orderAmount + postage + packaging;
    }

    public double calculatePostage(double orderAmount){
        if(orderAmount<100)
            return 2.00;
        else
            return 0.00;
    }

    public double calculatePackagingSupplement(double orderAmount){
        if(orderAmount<250)
            return 5.00;
        else
            return 0.00;
    }
}

import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountUI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00 EUR");
        Discount dis = new Discount();
        System.out.print("Auftragshoehe: ");
        double orderAmount = sc.nextDouble();

        double packaging = dis.calculatePackagingSupplement(orderAmount);
        System.out.println("Verpackungszuschlag: " + df.format(packaging));
        double postage = dis.calculatePostage(orderAmount);
        System.out.println("Porto: "+df.format(postage));
        System.out.println("Endpreis: " + df.format(dis.calculateInvoiceAmount(orderAmount, postage, packaging)));
        sc.close();
    }
}
```