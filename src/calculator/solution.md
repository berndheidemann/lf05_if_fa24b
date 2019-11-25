**Lösung Taschenrechner**

```
public String calculate(double number1, double number2, char operator) {
        double result;
        String resultString;
        if (operator == '+') {
            result = number1 + number2;
            resultString = number1 + " + " + number2 + " = " + result;
        } else if (operator == '-') {
            result = number1 - number2;
            resultString = number1 + " - " + number2 + " = " + result;
        } else if (operator == '*') {
            result = number1 * number2;
            resultString = number1 + " x " + number2 + " = " + result;
        } else if (operator == '/') {
            if (number2 == 0) {
                resultString = "Division durch 0 nicht möglich!";
            } else {
                result = number1 / number2;
                resultString = number1 + " : " + number2 + " = " + result;
            }
        } else {
            resultString = "Sie müssen einen der vier Operatoren +,-,*,/ eingeben!";
        }

        return resultString;
    }
```