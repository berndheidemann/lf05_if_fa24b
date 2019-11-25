# Maexchen**

„Mäxchen“ ist ein einfaches Würfelspiel, dessen vollständige Spielregeln hier nicht zu betrachten sind. Für das zu entwerfende Programm soll lediglich die Auswertung der Würfelaugen interessieren. Ein Spieler würfelt zwei Würfel. Der Wert des Wurfs ergibt sich aus den Augen der Würfel wie folgt:

1.	Der Wurf 1, 2 heißt „Mäxchen“ und ist 1000 Punkte wert.
2.	Ein Wurf mit zwei gleichen Augenzahlen wird als „Pasch“ bezeichnet und ist 100 * Augenzahl wert. Der Wurf 4, 4 hat also den Wert 400.
3.	Ansonsten ergibt sich die Punktzahl als 10 * höhere Augenzahl + niedrigere Augenzahl. Der Wurf 3, 5 hat beispielsweise die Punktzahl 53.

###Aufgaben:

Schreibe ein Programm, das die Augenzahl von zwei Würfeln von der Konsole einliest und den Wert des Wurfes ausgibt:
```
Erster Wurf: 5
Zweiter Wurf: 6
Punktzahl: 65
```

1.	Implementiere in der Klasse Maexchen die Methode `int calculatePoints(int throw1, int throw2)`, die anhand der ihr übergebenen Wurfwerte die Punktzahl der Spielrunde ermittelt. Wird der Methode ein Wurfwert ausserhalb des Intervalls 1 bis 6 übergeben, wird -1 zurückgegeben. 
2.	Schreibe für das Programm eine UI-Klasse, die in der main-Funktion die beiden Wurfergebnisse von der Konsole einliest und die mithilfe der Klasse `Maexchen` ausgewertete Punktzahl ausgibt.
3.	Erweitere deine UI-Klasse, indem du die Werte der Würfe zufällig generieren lässt.

**Tipp: Erzeugen einer Zufallszahl in Java**
```
Damit Du Zufallszahlen erzeugen kannst, musst Du in der ersten Zeile 
Deines Quellcodes die Klasse java.util.Random importieren (1). Unter (2)
wird ein Objekt vom Typ Random zur Erzeugug von Zufallszahlen mit dem 
Bezeichner generator erzeugt. 
Unter (3) wird der Variablen zahl ein Zufallswert aus dem Intervall von 0 bis 10 
(aus den ersten elf Zahlen beginnend bei 0) zugewiesen.

import java.util.Random; (1)
public class Zufallszahlen {
   public static void main (String[] args){
	   int zahl;
	   Random generator = new Random(); (2)
	   zahl = generator.nextInt(11); (3)
    }
}
```

* wqdqwd
* dwqfdwq wq
* fqfwwqdwqdwqd

##Gas Station
Al's Last Chance Gas Station befindet sich an der Straße 190 am Rande des Death Valley. Die nächsten 200 Meilen gibt es keine weitere Tankstelle. Sie sollen ein Programm schreiben, das den Fahrern hilft zu entscheiden, ob sie tanken sollen oder nicht. Das Programm fragt nach: 

* Der Tankkapazität in Gallonen (3,78l) 
* Der Benzinanzeige in Prozent (voll= 100, drei viertel voll = 75 usw.) 
* Dem Benzinverbrauch des Fahrzeuges in Meilen pro Gallone. 

Die Ausgabe des Programms ist "Tanken!", oder "Weiterfahren...". Je nachdem, ob das Fahrzeug genug Benzin für 200 Meilen hat oder nicht. 


![](../../imgs/uml.jpg)