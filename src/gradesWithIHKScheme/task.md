#IHK-Schema

Es ist ein Programm zu erstellen, das anhand der erreichten Punktzahl und der insgesamt zu erreichenden Punkte die Schulnote nach dem IHK-Schema ermittelt. Wie bei deinen Klassenarbeiten werden die erreichten Prozente auf null Nachkommastellen gerundet.

###Aufgaben
1. Implementiere in der Klasse `GradeCalculator`die Methode `public int calculateGrade(double points, int reachablePoints)`, die die Schulnote auf der Skala von 1-6 als Integer zurückgibt. Berücksichtige das unten angegebene Notenschema. Wenn die erreichten Punkte größer als die erreichbaren Punkte sind, gibt die Methode -1 zurück.

**Notenschema der IHK**

<table>
  <tr>
    <th>Prozent</th>
    <th>Note</th>
  </tr>
  <tr>
    <td>ab 92%</td>
    <td>1</td>
  </tr>
  <tr>
      <td>ab 81%</td>
      <td>2</td>
  </tr>
  <tr>
        <td>ab 67%</td>
        <td>3</td>
  </tr>
  <tr>
        <td>ab 50%</td>
        <td>4</td>
  </tr>
  <tr>
        <td>ab 30%</td>
        <td>5</td>
  </tr>
  <tr>
        <td>unter 30%</td>
        <td>6</td>
  </tr>
</table>

###Tipp
```
In Java kann eine Zahl mithilfe der Funktion Math.round() auf 0 Nachkommastellen
gerundet werden. Dazu muss die Klasse Math importiert werden. Im Beispiel wird 
die Zahl 7,65 auf 8 gerundet.

import java.lang.Math;
public class Runden {
  public static void main (String[] args) {
    double zahl = 7.65;
    zahl = Math.round(zahl); 
    ...
   }
}   

```