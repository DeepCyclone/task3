package by.epamtc.voloshchik.task3.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task3.logic.CalculationLogic;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        System.out.println("Enter side of a square:");
        double squareSide = sc.inputPositiveDouble();
        double inscribedSquareArea = CalculationLogic.calculateInscribedSquareArea(squareSide);
        System.out.println("Площадь квадрата,вписанного в окружность,которая в свою очередь вписана в квадрат:"
                + inscribedSquareArea);
        double areasRatio = CalculationLogic.calculateAreasRatio(squareSide);
        System.out.println("Площадь вписанного квадрата меньше площади исходного в " + areasRatio + " раз (раза)");
    }
}
