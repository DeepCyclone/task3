package by.epam.jwd.task7.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task7.logic.CalculationLogic;
import by.epam.jwd.task7.logic.Point;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        double x,y;
        System.out.println("Введите координату x первой точки:");
        x = sc.inputDouble();
        System.out.println("Введите координату y первой точки:");
        y = sc.inputDouble();
        Point a = new Point(x,y);
        System.out.println("Введите координату x второй точки:");
        x = sc.inputDouble();
        System.out.println("Введите координату y второй точки:");
        y = sc.inputDouble();
        Point b = new Point(x,y);
        CalculationLogic.compareDistances(a,b);
    }
}
