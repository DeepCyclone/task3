package by.epamtc.voloshchik.task4.logic;

public class CheckLogic {
    public static boolean isTwoNumsEven(int... nums)
    {
        int evenNumbers = 0;
        for(int number:nums)
        {
            if(number % 2 == 0)
            {
                evenNumbers++;
            }
        }
        return evenNumbers >= 2?true:false;
    }
}
