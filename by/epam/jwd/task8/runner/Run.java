package by.epam.jwd.task8.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task8.logic.CalculationLogic;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Введите число:");
        int x = sc.inputInteger();
        double result = CalculationLogic.evaluateExpression(x);
        System.out.println("Результат вычислений:" + result);
    }
}
