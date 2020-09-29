###Lösung Maexchen**

```
public int calculatePoints(int throw1, int throw2){
    int result = 0;
    if(throw1<1 || throw2<1 || throw1 > 6 || throw2>6 ){
        result = -1;
    }
    else if (throw1 + throw2 == 3) {
        result = 1000;
    } else if (throw1 == throw2) {
        result = throw1 * 100;
    } else if (throw1 > throw2) {
        result = 10 * throw1 + throw2;
    } else {
        result = 10 * throw2 + throw1;
    }
    return result;
}
```