package by.epam.jwd.task10.logic;

public class CalculationLogic {
    private static double evaluateFunction(int x)
    {
        return Math.tan(x);
    }
    public static void evaluateTangentBySteps(int a,int b,int h)
    {
        for(int x = a;x <= b;x += h)
        {
            System.out.println("Arg "+ x +"|Value " + evaluateFunction(x));
        }
    }
}
