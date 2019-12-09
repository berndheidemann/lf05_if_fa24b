#Sortieren**

Es soll ein Programm geschrieben werden, in dem ein Benutzer drei unterschiedliche Größen eingibt. Das Programm sortiert die eingegebenen Daten in absteigender Reihenfolge und gibt sie aus.

**Beispiel:**

```
erste Größe: 1,45
zweite Größe: 1,95
dritte Größe: 1,86

1. 1.95
2. 1.86
3. 1.45
```
###Aufgaben
1. Implementiere eine Klasse `Sort`. Diese soll eine Methode `public String sort(double size1, double size2, double size3)` besitzen, die die übergebenen Fließkommazahlen absteigend sortiert und als String im oben angegebenen Format zurückgibt. Der Sortiervorgang soll durch Tauschen stattfinden, d.h. im Ergebnisstring werden nacheinander Größe 1, Größe 2 und als letztes Größe 3 verarbeitet. 
2. Implementiere eine Klasse `SortUI`, die einem Benutzer ermöglicht, drei Fließkommazahlen über die Konsole einzugeben und diese zu sortieren. 