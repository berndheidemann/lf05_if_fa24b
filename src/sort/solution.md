###Lösung Sortieren

```
public class Sort {
    public String sort(double size1, double size2, double size3) {
        double temp;
        if (size1 < size2) {
            temp = size1;
            size1 = size2;
            size2 = temp;
        }

        if (size1 < size3) {
            temp = size1;
            size1 = size3;
            size3 = temp;
        }

        if (size2 < size3) {
            temp = size2;
            size2 = size3;
            size3 = temp;
        }
        return "\n1. "+size1+"\n2. "+size2+"\n3. "+size3;
    }
}
```

```
import java.util.Scanner;

public class SortUI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sort mySort = new Sort();
        double size1, size2, size3;

        System.out.print("erste Größe: ");
        size1 = sc.nextDouble();
        System.out.print("zweite Größe: ");
        size2 = sc.nextDouble();
        System.out.print("dritte Größe: ");
        size3 = sc.nextDouble();
        System.out.println(mySort.sort(size1, size2, size3));
    }
}
```