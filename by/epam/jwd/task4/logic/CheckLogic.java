package by.epam.jwd.task4.logic;

public class CheckLogic {
    public static void evenStatusChecker(int... nums)
    {
        int evenNumbers = 0;
        for(int number:nums)
        {
            if(number % 2 == 0)
            {
                evenNumbers++;
            }
        }
        System.out.println(evenNumbers>=2?"true":"false");
    }
}
