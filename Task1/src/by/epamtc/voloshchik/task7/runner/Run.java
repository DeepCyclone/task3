package by.epamtc.voloshchik.task7.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task7.bean.Point;
import by.epamtc.voloshchik.task7.logic.PointLogic;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        double x,y;
        System.out.println("Enter x coordinate of a first point:");
        x = sc.inputDouble();
        System.out.println("Enter y coordinate of a first point:");
        y = sc.inputDouble();
        Point a = new Point(x,y);
        System.out.println("Enter x coordinate of a second point:");
        x = sc.inputDouble();
        System.out.println("Enter y coordinate of a second point:");
        y = sc.inputDouble();
        Point b = new Point(x,y);
        Point nearestPoint = PointLogic.findNearestPointToCoordinatesOrigin(a,b);
        System.out.println(nearestPoint.toString() + " is the closest point to the coordinates origin");
    }
}
