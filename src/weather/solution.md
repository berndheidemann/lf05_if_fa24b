###Lösung Wetter

```
public class Weather {
    public String evaluateWeather(double temperature){
        if(temperature >= 22){
            return "Heute ist ein schöner Tag!";
        }
        else{
            return "Heute ist es nicht so schön!";
        }
    }
}
```

```
import java.util.Scanner;

public class WeatherUI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Weather weather = new Weather();
        double temperature;

        System.out.print("Geben Sie die Temperatur ein: ");
        temperature = sc.nextDouble();
        System.out.println(weather.evaluateWeather(temperature));
    }
}
```