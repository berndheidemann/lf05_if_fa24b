#Death Valley**
Al's Last Chance Gas Station befindet sich an der Straße 190 am Rande des Death Valley. Die nächsten 200 Meilen gibt es keine weitere Tankstelle. Du sollst ein Programm schreiben, das den Fahrern hilft zu entscheiden, ob sie tanken sollen oder nicht. Das Programm fragt nach: 

-	Der Tankkapazität in Gallonen (3,78l) 
-	Der Benzinanzeige in Prozent (voll= 100, drei Viertel voll = 75 usw.) 
-	Dem Benzinverbrauch des Fahrzeuges in Meilen pro Gallone. 

Die Ausgabe des Programms ist "Tanken!", oder "Weiterfahren..." -  Je nachdem, ob das Fahrzeug genug Benzin für 200 Meilen hat oder nicht. 

**Beispiel:**

```
Tankkapazität: 12
Benzinanzeige: 50
Meilen pro Gallone: 30
Tanken!
```
###Aufgaben
1. Implementiere eine Klasse `Tank`, die zur Auswertung eine Methode `public boolean enoughGas(int capacity, int gasDisplay, double consumption)` bereitstellt. 
2. Implementiere eine Klasse `DeathValleyUI`, die in der main-Methode den Benutzer die zur Auswertung nötigen Daten eingeben lässt, um zu erfahren, ob getankt werden muss oder der Füllstand des Tanks zum Durchfahren des Death Valley ausreicht. 