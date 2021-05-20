package by.epam.jwd.task10.logic;

public class CalculationLogic {
    private static double evaluateFunction(double x)
    {
        return Math.tan(x);
    }
    public static void evaluateTangentBySteps(double a,double b,double h)
    {
        if(h == 0 ||
                ((a - b > 0) && h > 0)||
                ((a - b < 0) && h < 0))
        {
            return;
        }
        for(double x = a;x <= b;x += h)
        {
            System.out.println("Arg "+ x +"|Value " + evaluateFunction(x));
        }
    }
}
