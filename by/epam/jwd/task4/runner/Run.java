package by.epam.jwd.task4.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task4.logic.CheckLogic;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        int a,b,c,d;
        System.out.println("Введите 4 числа:");
        a = sc.inputInteger();
        b = sc.inputInteger();
        c = sc.inputInteger();
        d = sc.inputInteger();
        CheckLogic.evenStatusChecker(a,b,c,d);
    }
}
