package by.epam.jwd.task9.logic;

public class ShapeParams {
    public static double countRingLength(double radius)
    {
        return 2 * Math.PI * radius;
    }
    public static double countCircleArea(double radius)
    {
        return Math.PI * Math.pow(radius,2);
    }
}
