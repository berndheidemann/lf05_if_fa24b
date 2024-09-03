package sort;

public class Sort {

    //      Input:              1,4          9,1            2,7
    //      Output:   "1. 9,1\n2. 2,7\n3.1,4"
    public String sort(double size1, double size2, double size3) {

        // Deklaration ohne Initialisierung
        // Dient dem Zwischenspeichern beim Tausch von zwei Werten
        double temp;
        if(size2>size1) {       //   size1: 1,4    size2: 9,1    size3: 2,7
            temp=size1;
            size1=size2;
            size2=temp;
        }                       // size1: 9,1    size2: 1,4     size3: 2,7
        if(size3>size2) {
            temp=size2;
            size2=size3;
            size3=temp;
                                // size1: 9,1    size2: 2,7     size 3: 1,4

            if (size2>size1) {
                temp=size1;
                size1=size2;
                size2=temp;
            }                   // size1: 9,1    size2: 2,7     size 3: 1,4
        }
        
        return      "1. "+ size1
                + "\n2.: " + size2
                + "\n3. " + size3;
    }
}
