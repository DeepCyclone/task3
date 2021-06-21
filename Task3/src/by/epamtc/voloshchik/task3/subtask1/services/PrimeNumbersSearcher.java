package by.epamtc.voloshchik.task3.subtask1.services;

public class PrimeNumbersSearcher {
    public static boolean isPrime(int number)
    {
        if(number == 0 || number == 1)
        {
            return false;
        }
        boolean state = true;
        for(int i = 2;i <= Math.sqrt(number);i++)
        {
            if(number % i == 0)
            {
                state = false;
                break;
            }
        }
        return state;
    }
}
