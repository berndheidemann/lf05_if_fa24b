package getMaximum;

public class Maximum{
    public int getMaximum(int number1, int number2, int number3){
        if (number1>number2){
            if (number1>number3)
                return number1;
            else
                return number3;
        }
        else{
            if (number2>number3)
                return number2;
            else
                return number3;
        }
    }
}

