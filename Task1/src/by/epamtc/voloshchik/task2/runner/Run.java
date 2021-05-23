package by.epamtc.voloshchik.task2.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task2.logic.DatesLogic;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        int month,year;
        System.out.println("Input month:");
        month = sc.inputMonth();
        System.out.println("Input year:");
        year = sc.inputPositiveInteger();
        System.out.println(DatesLogic.determineNumberOfDaysInMonth(year,month));
    }
}
