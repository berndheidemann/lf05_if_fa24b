###Lösung Horoskop

```
public class Horoscope {
    public String getHoroscope(int day, int month){
        return getGlossaryDay(day) + getGlossaryMonth(month);
    }

    private int getTens(int day){
        return day/10;
    }

    private int getOnePoint(int day){
        return day%10;
    }

    private String getGlossaryDay(int day){
        String result ="";
        switch (getTens(day)){
            case 0:{
                result = "In der Familie ";
                break;
            }
            case 1:{
                result = "In der Partnerschaft ";
                break;
            }
            case 2:{
                result = "Im Berufsleben ";
                break;
            }
            case 3:{
                result = "In der Liebe ";
                break;
            }
        }

        switch (getOnePoint(day)){
            case 0:{
                result += "fehlt Ihnen die Ausdauer. ";
                break;
            }
            case 1: {
                result += "kündigen sich Veränderungen an. ";
                break;
            }
            case 2:{
                result += "lassen Erfolge auf sich warten. ";
                break;
            }
            case 3:{
                result += "neigen Sie zur Bequemlichkeit. ";
                break;
            }
            case 4:{
                result += "müssen Sie mit unangenehmen Überraschungen rechnen. ";
                break;
            }
            case 5:{
                result += "sind Sie besonders kreativ. ";
                break;
            }
            case 6:{
                result += "befinden Sie sich in einer produktiven Phase. ";
                break;
            }
            case 7:{
                result += "eilen Sie von Erfolg zu Erfolg. ";
                break;
            }
            case 8:{
                result += "kann es zu einer Auseinandersetzung kommen. ";
                break;
            }
            case 9:{
                result += "sind Sie besonders aktiv.";
                break;
            }
        }
        return result;
    }

    private String getGlossaryMonth(int month){
        String result="";
        switch (month){
            case 1:
                result = "Machen Sie weiter so!";
                break;
            case 2:
                result = "Lassen Sie sich nicht beeinflussen! ";
                break;
            case 3:
                result = "Hören Sie auf den Rat eines Freundes!";
                break;
            case 4:
                result = "Werden Sie nicht übermütig!";
                break;
            case 5:
                result = "Seien Sie weniger kritisch!";
                break;
            case 6:
                result = "Ab und zu eine Pause einlegen!";
                break;
            case 7:
                result = "Suchen Sie eine Aussprache!";
                break;
            case 8:
                result ="Denken Sie nicht nur an sich!";
                break;
            case 9:
                result = "Nicht immer nur an andere denken!";
                break;
            case 10:
                result = "Achten Sie auf Ihre Gesundheit!";
                break;
            case 11:
                result = "Geldausgaben verschieben!";
                break;
            case 12:
                result = "Idealer Zeitpunkt für einen Neuanfang!";
                break;
        }
        return result;
    }
}

```

```
import java.util.Scanner;

public class HoroscopeUI {
    public static void main (String[] args) {
        int day, month;
        Scanner sc = new Scanner(System.in);
        Horoscope myHoroscope = new Horoscope();

        System.out.print("Tag: ");
        day = sc.nextInt();
        System.out.print("Monat: ");
        month = sc.nextInt();
        System.out.println(myHoroscope.getHoroscope(day, month));
        sc.close();
    }
}
```