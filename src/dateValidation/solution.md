**Lösung DateValidation**

```
public class DateValidator {

    public boolean validateDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12){
            return false;
        }
        else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            return true;
        }
        else if (month==4||month==6||month==9||month==11 ){
            if (day<31){
                return true;
            }
            else {
                return false;
            }
        }
        else if (year %4 ==0){
            if (year %100 ==0){
                if (year % 400==0){
                    if (day < 30)
                        return true;
                    else
                        return false;
                }
                else {
                    if (day < 29)
                        return true;
                    else
                        return false;
                }
            }
            else {
                if (day < 30)
                    return true;
                else
                    return false;
            }
        }
        else if (day < 29){
            return true;
        }
        else {
            return false;
        }
    }
}
```