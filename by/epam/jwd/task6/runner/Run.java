package by.epam.jwd.task6.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task6.logic.DateLogic;

public class Run
{
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Введите секунду:");
        int second = sc.inputPositiveInteger();
        DateLogic.determineFullData(second);
    }
}
