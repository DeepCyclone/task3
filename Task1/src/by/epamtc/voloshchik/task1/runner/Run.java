package by.epamtc.voloshchik.task1.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import  by.epamtc.voloshchik.task1.logic.*;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        System.out.println("Enter number");
        int number = sc.inputInteger();
        System.out.println("Last digit of squared number:" + DigitLogic.calculateLastDigitOfSquaredNumber(number));
    }
}
