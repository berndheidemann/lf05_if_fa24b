##Fußgesteuerte Schleife (do-while-Schleife) 

Viele Probleme können nur durch eine wiederholte Ausführung bestimmter Anweisungen gelöst werden. Die Wiederholung einer oder mehrerer Anweisungen nennt man Schleife. Bei den so genannten offenen Schleifen ist vorher nicht bekannt, wie oft die einzelnen Anweisungen wiederholt werden sollen. Die Anzahl der Schleifendurchläufe wird durch eine Bedingung gesteuert. Diese so genannte Abbruchbedingung wird bei jedem Schleifendurchlauf darauf geprüft, ob der Schleifenkörper noch einmal durchlaufen werden soll oder nicht.

Eine Möglichkeit, solche Problemstellungen zu lösen, ist in Java die do-while-Anweisung. In der do-while-Anweisung wird die Abbruchbedingung am Ende der Schleife geprüft. Solche Schleifen nennt man fußgesteuerte Schleifen. Solange die am Ende des Schleifenkörpers stehende Bedingung wahr ist, wird der Schleifenkörper durchlaufen. Diese Schleife wird somit mindestens einmal durchlaufen.

Syntax der fußgesteuerten Schleife:	Struktogramm:
	
```
do
{					
	Anweisung 1;
	Anweisung 2;
	...
} while (Ausdruck);
```
* Das Schlüsselwort `do` leitet die do-while-Anweisung ein.
* Die Anweisungen nach do sind die Anweisungen, die mehrmals wiederholt werden sollen. Sie werden mindestens einmal ausgeführt, da die Bedingungsprüfung erst am Ende der Schleife erfolgt.
* Nach dem Schleifenkörper findet hinter dem Schlüsselwort while eine Bedingungsprüfung statt. Der Ausdruck wird in runde Klammern gesetzt. Liefert der Ausdruck true, wird der Schleifenkörper nochmals ausgeführt. Liefert der Ausdruck false, werden die Anweisungen, die der Schleife folgen, ausgeführt.
* Die while-Anweisung wird durch ein Semikolon abgeschlossen.

Der Schleifenkörper kann beliebige Anweisungen enthalten; z.B. auch weitere do-while-Schleifen oder andere Kontrollstrukturen.

####Beispiel: 

Das folgende Programm gibt solange die Variable `zahl = zahl + 10` aus, solange der Wert der Variable kleiner als 100 ist.

```
public class Beispiel {
	public static void main (String[] args)	{
		int zahl=0;
		do
		{
			zahl=zahl+10;
			System.out.println(zahl);
		} while (zahl<100);
	}
}
```