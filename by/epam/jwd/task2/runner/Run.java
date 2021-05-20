package by.epam.jwd.task2.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task2.logic.DatesLogic;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        int month,year;
        System.out.println("Input month:");
        month = sc.inputInteger();
        System.out.println("Input year:");
        year = sc.inputInteger();
        System.out.println(DatesLogic.determineNumberOfDaysInMonth(year,month));
    }
}
