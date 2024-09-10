package maexchen;

import java.util.Random;
import java.util.Scanner;

public class MaexchenUI {


    /**
     * Erster Wurf: 5
     * Zweiter Wurf: 6
     * Punktzahl: 65
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Erster Wurf: ");
        int firstThrow = scan.nextInt();
        System.out.print("Zweiter Wurf: ");
        int secondThrow = scan.nextInt();

        Maexchen maexchen = new Maexchen();
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));

        Random random = new Random();
        firstThrow = random.nextInt(1, 7);
        secondThrow = random.nextInt(1, 7);
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));

        firstThrow = random.nextInt(1, 7);
        secondThrow = random.nextInt(1, 7);
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));

        firstThrow = random.nextInt(1, 7);
        secondThrow = random.nextInt(1, 7);
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));

        firstThrow = random.nextInt(1, 7);
        secondThrow = random.nextInt(1, 7);
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));

        firstThrow = random.nextInt(1, 7);
        secondThrow = random.nextInt(1, 7);
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));

        firstThrow = random.nextInt(1, 7);
        secondThrow = random.nextInt(1, 7);
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));

        firstThrow = random.nextInt(1, 7);
        secondThrow = random.nextInt(1, 7);
        System.out.println("Punktzahl: " + maexchen.calculatePoints(firstThrow, secondThrow));


    }
}
