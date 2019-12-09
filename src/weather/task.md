#Wetter*
Entwickle ein Programm, bei dem der Benutzer eine Temperatur eingeben muss. Ist die Temperatur größer oder gleich 22 Grad Celsius, soll das Programm „Heute ist ein schöner Tag!“ ausgeben. Ist die Temperatur kleiner als 22 Grad Celsius wird „Heute ist es nicht so schön!“ ausgegeben:

**Beispiel:**

```
Geben Sie die Temperatur ein: 25
Heute ist ein schöner Tag!
```
###Aufgaben
1. Implementiere eine Klasse `Weather`. Diese soll eine Methode `public String evaluateWeather(double temperature)` besitzen, die je nach übergebener Temperatur einen der oben genannten Ergebnisstrings zurückgibt.
2. Implementiere eine Klasse `WeatherUI`, die in der main-Methode ein Weather-Objekt instanziiert und dieses eine vom Benutzer eingegebene Temperatur auswerten lässt.
