package by.epam.jwd.task1.runner;

import by.epam.jwd.scanner.ScannerLogic;
import  by.epam.jwd.task1.logic.*;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Input number");
        int number = sc.inputInteger();
        System.out.println("Last digit of squared number:" + DigitLogic.getLastDigitOfSquaredNumber(number));
    }
}
