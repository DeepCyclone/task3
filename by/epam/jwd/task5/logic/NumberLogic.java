package by.epam.jwd.task5.logic;

public class NumberLogic {
    public static void checkIdealStatus(int number)
    {
        int dividersSum = 0;
        for(int i = 1;i < number;i++)
        {
            if(number % i == 0)
            {
                dividersSum+=i;
            }
        }
        System.out.println(dividersSum==number?"true":"false");
    }
}
