package by.epam.jwd.task7.logic;

public class CalculationLogic {
    private static double evaluateDistance(Point p)
    {
        return Math.sqrt(Math.pow(p.getX(),2) + Math.pow(p.getY(),2));
    }
    public static void compareDistances(Point A,Point B)
    {
        double distanceA = evaluateDistance(A);
        double distanceB = evaluateDistance(B);
        if(distanceA == distanceB)
        {
            System.out.println("Расстояния равны");
        }
        else if(distanceA > distanceB)
        {
            System.out.println("Точка A расположена дальше точки B");
        }
        else
        {
            System.out.println("Точка B расположена дальше точки A");
        }
    }
}
