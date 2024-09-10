package weather;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeatherUI {

    public static void main(String[] args) {


        List<Integer> data=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(i);
        }

        // get a slice of the list 3:7
        List<Integer> slice=data.subList(3, 7);
        for (Integer integer : slice) {
            System.out.println(integer);
        }



        Scanner scan=new Scanner(System.in);
        System.out.print("Geben Sie eine Temperatur ein: ");
        int temperatur=scan.nextInt();

        // Ich muss jetzt auf die Klasse Weather zugreifen, denn dort soll
        // die Temperatur ausgewertet werden

        // dafür muss ein Objekt vom Typ Weather gebaut werden
        Weather weather=new Weather();

        // Ich rufe auf dem Objekt "weather" die selbst geschriebene Methode "evaluateWeather" auf,
        // übergebe die vom Benutzer eingegebene Temperatur
        // und speichere das Ergebnis (schönes Wetter, schlechtes Wetter" in der Variablen response
        String response=weather.evaluateWeather(temperatur);
        System.out.println(response);




    }

}
