**Lösung trainInByteburg**

```
public class TicketCalculator {
    final static int ANZAHLLINIEN = 5;

    public int calculateTicketprice(int startRailwayStation, int exitRailwayStation){
        int ticketPrice=0;

        int start = getLowestStation(startRailwayStation, exitRailwayStation);
        int exit = getHighestStation(startRailwayStation, exitRailwayStation);
        if(isWrongStationOrWrongLine(start) || isWrongStationOrWrongLine(exit))
            return -1;

        int startLine = getLine(start);
        int startStationNumber = getStation(start);
        int exitLine = getLine(exit);
        int exitStationNumber = getStation(exit);

        if(isShort(startLine, startStationNumber,exitLine, exitStationNumber))
            ticketPrice = 1;
        else{
            ticketPrice = 2;
            if(isOneZoneBoundaryExceeded(startStationNumber, exitStationNumber)){
                ticketPrice ++;
            }
            else if(isTwoZoneBoundaryExceeded(startStationNumber, startLine, exitStationNumber, exitLine)) {
                ticketPrice+=2;
            }
        }
        if(finalDestinationUsed(startStationNumber))
            ticketPrice++;
        if(finalDestinationUsed(exitStationNumber))
            ticketPrice++;

        return ticketPrice;
    }

    private boolean isWrongStation(int stationNumber){
        if(stationNumber <1 || stationNumber >6){
            return true;
        }
        return false;
    }

    private boolean isWrongLine(int line){
        if(line < 1 || line > ANZAHLLINIEN){
            return true;
        }
        return false;
    }

    private boolean isWrongStationOrWrongLine(int stationNumber){
        if(stationNumber == 0)
            return false;
        int line = getLine(stationNumber);
        int station = getStation(stationNumber);

        if(isWrongStation(station))
            return true;
        if(isWrongLine(line))
            return true;
        return false;
    }

    private boolean finalDestinationUsed(int station){
        if(station == 6)
            return true;
        return false;
    }

    private boolean isOneZoneBoundaryExceeded(int startStation, int exitStation){
        //beide Fälle sind nötig: 24->21 und 51-> 14
        if(startStation<4 && exitStation>3)
            return true;
        else if(startStation>=4 && exitStation<4)
            return true;
        return false;
    }

    private boolean isTwoZoneBoundaryExceeded(int startStation, int startLine, int exitStation, int exitLine){
        // Wenn beide im Außenraum liegen, müssen die Linien verglichen werden; entweder 2 Zonengrenzen oder keine
           if(startStation > 3 && exitStation >3 && startLine!= exitLine)
               return true;
           else
               return false;
    }

    private boolean isShort(int startLine, int startStationNumber, int exitLine, int exitStationNumber ){
        //Kurzfahrt entlang einer Hauptlinie
        if(startLine == exitLine && startStationNumber +1 == exitStationNumber)
            return true;
        //Kurzfahrt entlang der Ringlinie
        else if(startStationNumber == 3 && exitStationNumber==3 && startLine+1 == exitLine)
            return true;
        // Kurzfahrt auf der Ringlinie von Linie 1 zur hoechsten Linie
        else if(startStationNumber == 3 && exitStationNumber==3 && exitLine == ANZAHLLINIEN && startLine ==1)
            return true;
        //Kurzfahrt vom bzw. zum Zentrum, Summe der Einerstellen ist dann 1
        else if( startStationNumber + exitStationNumber == 1)
            return true;
        return false;
    }

    private int getStation(int number){
        return number%10;
    }

    private int getLine(int number){
        return number/10;
    }

    private int getHighestStation(int number1, int number2){
        if(number1 > number2)
            return number1;
        else
            return number2;
    }

    private int getLowestStation(int number1, int number2){
        if(number1 < number2)
            return number1;
        else
            return number2;
    }
}
```