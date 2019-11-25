#Datumsprüfung***
Es soll eine Klasse DateValidator geschrieben werden, die Datumsangaben auf ihre Richtigkeit überprüft. Das Datum 22.08.1977 ist beispielsweise ein gültiges Datum; 32.08.2019 ist dagegen ungültig. Dabei ist die Schaltjahresregel zu berücksichtigen: wenn das Jahr durch 4 teilbar ist, ist es ein Schaltjahr. Ist dieses Jahr allerdings auch durch 100 teilbar, ist es kein Schaltjahr. Ist ein Jahr allerdings durch 4, durch 100 und durch 400 teilbar, ist es doch ein Schaltjahr.

###Aufgaben

1. Implementiere in der Klasse `DateValidator`die Methode `public boolean validateDate(int day, int month, int year)`. Sie gibt true zurück, wenn es sich um ein korrektes Datum handelt und false bei einem nicht validen Datum.
2. Schreibe eine UI-Klasse, in der der Benutzer über die Konsole ein Datum eingibt und ausgegeben bekommt, ob das Datum korrekt ist.

**Beispiel:**

```
Tag: 5
Monat: 6
Jahr: 2020
Das Datum ist richtig!
```

**Tipps**
1. Die Bedingung einer if-Anweisung kann aus mehreren Bedingungen zu einem Ausdruck zusammengesetzt werden. Die Verknüpfung zweier Bedingungen geschieht dabei durch den UND- oder den ODER-Operator. 
   Ein Ausdruck, in dem zwei Bedingungen mithilfe des UND-Operators (&&) verknüpft sind, liefert nur den Wahrheitswert true, wenn beide Aussagen true sind.
   Ein Ausdruck, in dem zwei Bedingungen mithilfe des ODER-Operators (||) verknüpft sind, liefert schon dann den Wahrheitswert true, wenn nur eine der beiden Aussagen true ist.
2. Für die Prüfungen brauchst du den so genannten Modulo-Operator (%). Dieser liefert bei einer Division zweier Zahlen den Rest der Division:
   
   6 % 4 = 1		, weil 6/4 = 1 Rest 2  
   8 % 4 = 0		, weil 8 vollständig durch 2 teilbar ist.
