#Taschenrechner*

Es soll ein einfacher Taschenrechner programmiert werden, der die Rechenoperationen +, -, * und  / unterstützt.

###Aufgaben
1. Implementiere in der Klasse `Calculator`die Methode `public String calculate(double number1, double number2, char operator)`. Sie bekommt zwei Fließkommazahlen sowie die Rechenoperation als char übergeben. Sie gibt das Ergebnis als String im Format `1 + 2 = 3` zurück. Versucht ein Client durch 0 zu teilen, gibt die Methode die Fehlermeldung "Division durch 0 nicht möglich!" zurück. Wird eine andere oder falsche Rechenoperation angefordert, wird die Fehlermeldung "Sie müssen einen der vier Operatoren +,-,*,/ eingeben!" zurückgegeben. 
2. Schreibe eine UI-Klasse, in der der Benutzer über die Konsole ein eine Rechenoperation in Auftrag gibt und das ergebnis angezeigt bekommt.
3. Schreibe eine zweite Variante des Programms, in der du eine geeignte switch-case-Anweisung statt einer if-else-Leiter verwendest. 

**Beispiel:**

```
erste Zahl: 1
zweite Zahl: 2
Rechenoperation: +

1 + 2 = 3
```

