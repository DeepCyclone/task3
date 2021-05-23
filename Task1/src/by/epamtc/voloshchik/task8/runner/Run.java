package by.epamtc.voloshchik.task8.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task8.logic.CalculationLogic;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        System.out.println("Enter number:");
        int x = sc.inputInteger();
        double result = CalculationLogic.evaluateExpression(x);
        System.out.println("Result:" + result);
    }
}
