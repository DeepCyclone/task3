package by.epamtc.voloshchik.task3.subtask1.runner;

import by.epamtc.voloshchik.task3.subtask1.bean.Array;
import by.epamtc.voloshchik.task3.subtask1.exceptions.ArrayCapacityLackException;
import by.epamtc.voloshchik.task3.subtask1.services.*;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Run {
    public static void main(String[] args)
    {
        Array numbers = new Array();
        try {
        numbers.setElement(0,788);
        numbers.setElement(1,257);
        numbers.setElement(2,456);
        numbers.setElement(3,353);
        numbers.setElement(4,564);
        numbers.sort(new BubbleSort());
        System.out.println(numbers.toString());
        numbers.setElement(25,4);
        int[] fibs = ArrayService.findAllFibonacciNumbers(numbers);
        int[] primes = ArrayService.findAllPrimes(numbers);
        ArrayFiller.fillFromFile(numbers);
        }
        catch (IndexOutOfBoundsException | FileNotFoundException | ArrayCapacityLackException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(numbers.toString());
        //numbers.setElement(5,26);
        numbers.removeElement(0);
        //ArrayService.findAllUniqueThreeDigitNumbers(numbers);
        System.out.println(numbers.indexOf(788));
        System.out.println(numbers.indexOf(55));
        System.out.println(numbers.indexOf(22));
        System.out.println(numbers.indexOf(72));
        System.out.println(numbers.indexOf(0));
    }
}
