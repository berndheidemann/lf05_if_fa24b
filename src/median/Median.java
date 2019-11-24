package median;

public class Median {
    /*
      Es gibt die nachfolgenden 6 Kombinationen:

      1. a<b<c
      2. a<c<b
      3. b<a<c
      4. b<c<a
      5. c<a<b
      6. c<b<a

    Durch Tests können diese Möglichkeiten in Gruppen aufgeteilt werden, bis in
    jeder Gruppe nur noch eine Möglichkeit übrig bleibt und der Median feststeht.
    Der erste Test a<b trennt die Möglichkeiten 1, 2 und 5 von den übrigen. Jede
    Gruppe enthält jetzt noch drei Möglichkeiten. Ein weiterer Vergleich b <c
    spaltet die Gruppen weiter auf. In zwei Fällen bleibt nur noch eine Möglichkeit,
    so dass für die verbleibenden Fälle jeweils noch ein letzter Vergleich
    durchgeführt werden muss.
    */
    public int getMedian(int a, int b, int c) {
        int median;

        if (a<b){
            if (b<c)
                median = b;
            else
            if (a<c)
                median = c;
            else
                median = a;
        }
        else
        if (b<c){
            if (a<c)
                median = a;
            else
                median = c;
        }
        else
            median = b;

        return median;
    }
}
