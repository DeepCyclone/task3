package by.epam.jwd.task10.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task10.logic.CalculationLogic;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Введите левую границу:");
        double a = sc.inputDouble();
        System.out.println("Введите правую границу:");
        double b = sc.inputDouble();
        System.out.println("Введите шаг:");
        double h = sc.inputDouble();
        CalculationLogic.evaluateTangentBySteps(a,b,h);
    }
}
