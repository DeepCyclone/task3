package by.epamtc.voloshchik.task8.logic;

public class CalculationLogic {
    public static double evaluateExpression(int x)
    {
        double result;
        if(x >= 3) {
            result = -Math.pow(x,2) + 3 * x + 9;
        }
        else {
            if((Math.pow(x,3) - 6) == 0)return 0;
            result = 1 / (Math.pow(x,3) - 6);
        }
        return result;
    }
}