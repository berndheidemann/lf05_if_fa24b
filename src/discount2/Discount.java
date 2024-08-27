package discount2;

public class Discount {

    // Ein Versandgeschäft berechnet bei Aufträgen unter 100 €
    // einen Zuschlag für Porto von 2 Euro.
    public double calcPostage(double amount) {
        // wenn der Betrag unter 100 ist
        if (amount<100) {
            // füge dem Betrag zwei euro Porto hinzu
            return 2;
        } else {
            // ansonsten gib den Betrag ohne Porto zurück
            return 0;
        }
    }

    // Bei Aufträgen unterhalb von 250 Euro fällt ein
    // Verpackungszuschlag von 5 Euro an.
    public double calcPackackingSurcharge(double amount) {
        if (amount<250) {
            return 5;
        } else {
            return 0;
        }
    }

    // Der Versandhandel gewährt bei Aufträgen ab 500
    // Euro einen Rabatt von 5%.
    public double calcDiscount(double amount) {
        if (amount>=500) {
            return amount*0.95;
        } else {
            return amount;
        }
    }


    public double calcBillAmount(double amount) {
        // hier erhalten wir 0 oder 2 (je nach Höhe von amount)
        double postage=calcPostage(amount);

        // hier erhalten wir 0 oder 5 (je nach Höhe von amount)
        double packackingSurcharge=calcPackackingSurcharge(amount);

        // wir überschreiben die Variable amount, in der der aktuelle
        // Rechnungsbetrag hinterlegt ist, mit dem neuen Rechnungsbetrag
        // also entweder abzüglich Rabatt oder ohne (je nach Höhe)
        amount=calcDiscount(amount);

        // wir addieren zum evtl. rabattierten Preis das Porto und die Verpackung
        amount=amount+postage+packackingSurcharge;

        // Rückgabe des Endbetrags
        return amount;

    }
}
