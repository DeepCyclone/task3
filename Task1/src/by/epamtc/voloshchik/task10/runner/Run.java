package by.epamtc.voloshchik.task10.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task10.logic.CalculationLogic;
import by.epamtc.voloshchik.task10.logic.PrintLogic;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        System.out.println("Enter left border:");
        double a = sc.inputDouble();
        System.out.println("Enter right border:");
        double b = sc.inputDouble();
        System.out.println("Enter calculation step:");
        double h = sc.inputDouble();
        double[][] keyValues = CalculationLogic.evaluateTangentBySteps(a,b,h);
        PrintLogic.print(keyValues);
    }
}
