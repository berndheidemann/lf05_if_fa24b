###Lösung Morsen

```
public class Morse {

    public int morse(char sign1, char sign2, char sign3, char sign4, char sign5)
    {
        if ((sign1 == '-') && (sign2 == '-') &&
                (sign3 == '-') && (sign4 == '-') &&
                (sign5 == '-')) {
            return 0;
        }
        else if ((sign1 == '.') && (sign2 == '-') &&
                (sign3 == '-') && (sign4 == '-') &&
                (sign5 == '-')) {
            return 1;
        }
        else if ((sign1 == '.') && (sign2 == '.') &&
                (sign3 == '-') && (sign4 == '-') &&
                (sign5 == '-')) {
            return 2;
        }
        else if ((sign1 == '.') && (sign2 == '.') &&
                (sign3 == '.') && (sign4 == '-') &&
                (sign5 == '-')) {
            return 3;
        }
        else if ((sign1 == '.') && (sign2 == '.') &&
                (sign3 == '.') && (sign4 == '.') &&
                (sign5 == '-')) {
            return 4;
        }
        else if ((sign1 == '.') && (sign2 == '.') &&
                (sign3 == '.') && (sign4 == '.') &&
                (sign5 == '.')) {
            return 5;
        }
        else if ((sign1 == '-') && (sign2 == '.') &&
                (sign3 == '.') && (sign4 == '.') &&
                (sign5 == '.')) {
            return 6;
        }
        else if ((sign1 == '-') && (sign2 == '-') &&
                (sign3 == '.') && (sign4 == '.') &&
                (sign5 == '.')) {
            return 7;
        }
        else if ((sign1 == '-') && (sign2 == '-') &&
                (sign3 == '-') && (sign4 == '.') &&
                (sign5 == '.')) {
            return 8;
        }
        else if ((sign1 == '-') && (sign2 == '-') &&
                (sign3 == '-') && (sign4 == '-') &&
                (sign5 == '.')) {
            return 9;
        }
        else {
            return -1;
        }
    }
}

import java.util.Scanner;

public class MorseUI {
    public static void main(String[] args){
        Morse m = new Morse();
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
```