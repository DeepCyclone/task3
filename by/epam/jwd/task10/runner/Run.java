package by.epam.jwd.task10.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task10.logic.CalculationLogic;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Введите левую границу:");
        int a = sc.inputPositiveInteger();
        System.out.println("Введите правую границу:");
        int b = sc.inputPositiveInteger();
        System.out.println("Введите шаг:");
        int h = sc.inputPositiveInteger();
        CalculationLogic.evaluateTangentBySteps(a,b,h);
    }
}
