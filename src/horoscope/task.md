#Horoskop**
Ein Hobby-Astrologe hat sich zur Vereinfachung seiner Prognosen einen "Horoskop-Generator" ausgedacht. Er hat für ein Horoskop typische Formulierungen gesammelt und so miteinander kombiniert, dass die einzelnen Satzteile beliebig austauschbar sind. Ein Horoskop setzt sich jeweils aus drei Satzbauteilen zusammen, die anhand der Zehnerstelle und der Einerstelle des Geburtstags sowie des dazugehörigen Monats zusammengesetzt werden:

Horoskopformulierungen
----
Tag (Zehnerstelle) | Tag (Einerstelle) | Monat
-------- | -------- | --------      
0 In der Familie | 0 fehlt Ihnen die Ausdauer.| 1 Machen Sie weiter so!
1 In der Partnerschaft|1 kündigen sich Veränderungen an.|2 Lassen Sie sich nicht beeinflussen!
2 Im Berufsleben|2 lassen Erfolge auf sich warten.|3 Hören Sie auf den Rat eines Freundes!
3 In der Liebe|3 neigen Sie zur Bequemlichkeit.|4 Werden Sie nicht übermütig!
| |4 müssen Sie mit unangenehmen Überraschungen rechnen.|5 Seien Sie weniger kritisch!
| |5 sind Sie besonders kreativ.|6 Ab und zu eine Pause einlegen!
| |6 befinden Sie sich in einer produktiven Phase.|7 Suchen Sie eine Aussprache!
| |7 eilen Sie von Erfolg zu Erfolg.|8 Denken Sie nicht nur an sich!
| |8 kann es zu einer Auseinandersetzung kommen.|9 Nicht immer nur an andere denken!
| |9 sind Sie besonders aktiv.|10 Achten Sie auf Ihre Gesundheit!
| | |11 Geldausgaben verschieben!
| | |12 Idealer Zeitpunkt für einen Neuanfang!

###Aufgaben
1. Implementiere eine Klasse `Horoscope`, die für die Erstellung eines Horoskops anhand des Geburtsdatums die Methode `public String getHoroscope(int day, int month)` bereitstellt. Teile deinen Quellcode innerhalb der Klasse `Horoscope` wieder auf mehrere Methoden auf, so dass jede nur eine Aufgabe besitzt. Verwende für deine Fallunterscheidungen die switch-case-Kontrollstruktur.
2. Implementiere eine Klasse `HoroscopeUI`, die in der main-Methode den Benutzer sein Geburtsdatum eingeben lässt, um sein Horoskop zu erhalten. 

**Beispiel:**

```
Tag: 24
Monat: 6
Im Berufsleben müssen Sie mit unangenehmen Überraschungen rechnen. Ab und zu eine Pause einlegen!

```
