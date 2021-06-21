package by.epamtc.voloshchik.task3.subtask1.services;

import java.util.ArrayList;

public class FibonacciNumbersSearcher {
    private static ArrayList<Integer> fibBuffer = new ArrayList<>();
    static
    {
        fibBuffer.add(0);
        fibBuffer.add(1);
        fibBuffer.add(1);
    }
    public static boolean isFibonacciNumber(int number)
    {
        if(number < 0)
        {
            return false;
        }
        while(number > fibBuffer.get(fibBuffer.size()-1))
        {
            fibBuffer.add(fibBuffer.get(fibBuffer.size() - 2) + fibBuffer.get(fibBuffer.size() - 1));
        }
        return fibBuffer.contains(number);
    }

}
