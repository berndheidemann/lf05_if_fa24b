package trainInByteburg;

public class TicketCalculator {
    public int calculateTicketPrice(int von, int nach)
    {
        int linien = 5;// maximale Linien, das erleichtert die Anpassbarkeit des Programms
        int min, max, preis = 0;

        if(von > nach)
        {
            max = von;
            min = nach;
        }
        else
        {
            max = nach;
            min = von;
        }

        int linie_min = min/10;
        int station_min = min%10;
        int linie_max = max/10;
        int station_max = max%10;

        //Kurzfahrt entlang einer Hauptlinie
        if(linie_min == linie_max && station_min +1 == station_max)
            preis = 1;
            //Kurzfahrt entlang der Ringlinie
        else if( station_min == 3 && station_max==3 && linie_min+1 == linie_max)
            preis = 1;
            // Kurzfahrt auf der Ringlinie von Linie 1 zur hoechsten Linie
        else if(station_min == 3 && station_max==3 && linie_max == linien && linie_min ==1)
            preis = 1;
            //Kurzfahrt vom bzw. zum Zentrum, Summe der Einerstellen ist dann 1
        else if( station_min + station_max == 1)
            preis = 1;
            //in allen anderen Fällen ist der Preis 2 zuzüglich möglicher Aufschläge
        else
        {
            preis = 2;
            //Zonengrenze wird überquert, wenn eine Stationsnummer im Innenraum, die andere im Außenraum liegt
            if(station_min<4 && station_max>3)
                preis ++;
            else if(station_min>=4 && station_max<4)
                preis ++;
                // Wenn beide im Außenraum liegen, müssen die Linien verglichen werden; entweder 2 Zonengren-zen oder keine
            else if(station_min > 3 && station_max >3 && linie_max!= linie_min)
                preis = preis + 2;

            //Aufpreis für Endstationen
            if(station_min  == 6)
                preis ++;
            if(station_max == 6)
                preis ++;
        }
        //Ausgabe des Preises
        System.out.println("Preis: "+preis);
    }

}
