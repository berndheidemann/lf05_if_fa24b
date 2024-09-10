package maexchen;

public class Maexchen {


    /**
     * 1.	Der Wurf 1, 2 heißt „Mäxchen“ und ist 1000 Punkte wert.
     * 2.	Ein Wurf mit zwei gleichen Augenzahlen wird als „Pasch“
     * bezeichnet und ist 100 * Augenzahl wert. Der Wurf 4, 4 hat also den Wert 400.
     * 3.	Ansonsten ergibt sich die Punktzahl als 10 * höhere Augenzahl + niedrigere Augenzahl.
     * Der Wurf 3, 5 hat beispielsweise die Punktzahl 53.
     */
    public int calculatePoints(int throw1, int throw2) {
        if (throw1 == 1 && throw2 == 2 || throw1 == 2 && throw2 == 1) {
            return 1000;  // beendet die Funktion
        }
        if (throw1 > 6 || throw2 > 6 || throw1 < 1 || throw2 < 1) {
            return -1;
        }
        if (throw1 == throw2) {
            return 100 * throw1; // beendet die Funktion
        }
        if (throw1 > throw2) {
            return throw1 * 10 + throw2; // beendet die Funktion
        }
        if (throw2 > throw1) {
            return throw2 * 10 + throw1; // beendet die Funktion
        }
        return -1;
    }
}
