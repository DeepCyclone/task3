package by.epam.jwd.task9.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task9.logic.ShapeParams;
public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Введите радиус:");
        double radius = sc.inputPositiveDouble();
        System.out.println("Длина окружности заданного радиуса:" + ShapeParams.countRingLength(radius));
        System.out.println("Площадь круга заданного радиуса:" + ShapeParams.countCircleArea(radius));
    }
}
