package by.epamtc.voloshchik.task10.logic;

public class CalculationLogic {
    public static double[][] evaluateTangentBySteps(double a,double b,double h)
    {
        if(h == 0 ||
                ((a - b > 0) && h > 0)||
                ((a - b < 0) && h < 0))
        {
            return null;
        }
        int values = Math.abs((int)((b - a) / h));
        double[][] keyValue = new double[values+1][2];
        for(int i = 0;i<=values;i++)
        {
            keyValue[i][0] = a;
            keyValue[i][1] = Math.tan(a);
            a+=h;
        }
        return keyValue;
    }
}
