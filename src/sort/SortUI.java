package sort;

import java.util.Scanner;

public class SortUI {

    public static void main(String[] args) {
        // Scanner wird erstellt
        Scanner scan=new Scanner(System.in);

        // Ich fordere den Benutzer zur Eingabe auf und lese die drei Double-Werte ein
        System.out.print("Geben Sie die erste Zahl ein: ");
        double number1=scan.nextDouble();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        double number2=scan.nextDouble();
        System.out.print("Geben Sie die dritte Zahl ein: ");
        double number3=scan.nextDouble();

        // ich erstelle ein Objekt der Klasse Sort, in der sich unser Quellcode befindet
        Sort sortingObject=new Sort();
        // Aufruf der Methode sort auf dem Objekt sortingObject und Ausgabe des Ergebnisses
        System.out.println(sortingObject.sort(number1, number2, number3));
    }
}
