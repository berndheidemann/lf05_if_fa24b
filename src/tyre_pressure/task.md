## Reifendruck*
![](../../imgs/tyre_pressure.jfif) 

Im `TyrePressureCalculator` soll der Reifendrucks eines Wagens geprüft werden. Dabei gelten folgende Anforderungen:
* Die beiden Vorderreifen müssen innerhalb einer Toleranz von 3 PSI den gleichen Druck haben
* Die beiden Hinterreifen müssen innerhalb einer Toleranz von 3 PSI den gleichen Druck haben
* Jeder Reifen muss einen Druck im Bereich von 35 bis 45 PSI haben 

Die beiden ersten Anforderungen werden in der Methode `public boolean calc(int frontRight, int frontLeft, int behindRight, int behindLeft)`, 
die dritte in der Methode `public boolean checkTyre(int pressure)` überprüft.

