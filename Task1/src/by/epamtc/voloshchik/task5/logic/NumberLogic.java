package by.epamtc.voloshchik.task5.logic;

public class NumberLogic {
    public static boolean isNumberIdeal(int number)
    {
        int dividersSum = 0;
        for(int i = 1;i < number;i++)
        {
            if(number % i == 0)
            {
                dividersSum+=i;
            }
        }
        return dividersSum == number?true:false;
    }
}
