package by.epamtc.voloshchik.task9.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task9.logic.ShapeParams;
public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        System.out.println("Enter radius:");
        double radius = sc.inputPositiveDouble();
        System.out.println("Length of a ring with current radius:" + ShapeParams.countRingLength(radius));
        System.out.println("Square of a circle with current radius:" + ShapeParams.countCircleArea(radius));
    }
}
