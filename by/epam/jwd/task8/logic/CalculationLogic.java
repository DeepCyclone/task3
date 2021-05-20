package by.epam.jwd.task8.logic;

public class CalculationLogic {
    public static double evaluateExpression(int x)
    {
        double result;
        if(x >= 3) {
            result = calculateFirstBranch(x);
        }
        else {
            result = calculateSecondBranch(x);
        }
        return result;
    }
    private static double calculateFirstBranch(int x)
    {
        System.out.println("Ветка -x^2 + 3x + 9");
        double result = -Math.pow(x,2) + 3 * x + 9;
        return result;
    }
    private static double calculateSecondBranch(int x)
    {
        System.out.println("Ветка 1 / (x^3 - 6)");
        if((Math.pow(x,3) - 6) == 0)return 0;//try catch
        double result = 1 / (Math.pow(x,3) - 6);
        return result;
    }
}