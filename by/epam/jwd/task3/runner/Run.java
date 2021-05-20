package by.epam.jwd.task3.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task3.logic.CalculationLogic;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Введите сторону квадрата:");
        double squareSide = sc.inputPositiveDouble();
        double inscribedSquareArea = CalculationLogic.calculateInscribedSquareArea(squareSide);
        System.out.println("Площадь квадрата,вписанного в окружность,которая в свою очередь вписана в квадрат:"
                + inscribedSquareArea);
        double areasRatio = CalculationLogic.calculateAreasRatio(squareSide);
        System.out.println("Площадь вписанного квадрата меньше площади исходного в " + areasRatio + " раз (раза)");
    }
}
