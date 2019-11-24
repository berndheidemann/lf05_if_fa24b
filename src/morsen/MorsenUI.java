package morsen;

import java.util.Scanner;

public class MorsenUI {
    public static void main(String[] args){
        Morsealphabet m = new Morsealphabet();

        Scanner sc = new Scanner(System.in);

        System.out.print("1. Zeichen eingeben: ");
        char sign1 = sc.next().charAt(0);
        System.out.print("2. Zeichen eingeben: ");
        char sign2 = sc.next().charAt(0);
        System.out.print("3. Zeichen eingeben: ");
        char zeichen3 = sc.next().charAt(0);
        System.out.print("4. Zeichen eingeben: ");
        char zeichen4 = sc.next().charAt(0);
        System.out.print("5. Zeichen eingeben: ");
        char zeichen5 = sc.next().charAt(0);

    }
}
