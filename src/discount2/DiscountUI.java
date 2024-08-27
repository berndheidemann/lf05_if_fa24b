package discount2;

import java.util.Scanner;

public class DiscountUI {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Geben Sie den Rechnungsbetrag ein: ");
        double amount=scan.nextDouble();
        // wir erstellen das Objekt mit der Fachlogik
        // Discount ist der selbst erstellte Datentyp
        Discount discount=new Discount();

        /*
        Auftragshöhe: 80
        Verpackungszuschlag: 5,00 EUR
        Porto: 2,00 EUR
        Endpreis: 87,00 EUR
         */

        System.out.println("Auftragshöhe: " + amount);
        System.out.println("Verpackungszuschlag: " + discount.calcPackackingSurcharge(amount));
        System.out.println("Porto: " + discount.calcPostage(amount));
        System.out.println("Endpreis: " + discount.calcBillAmount(amount));

    }
}
