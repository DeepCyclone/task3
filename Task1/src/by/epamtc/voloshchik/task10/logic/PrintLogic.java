package by.epamtc.voloshchik.task10.logic;

public class PrintLogic {
    public static void print(double[][] keyValue)
    {
        if(keyValue == null)
        {
            return;
        }
        for(double[] x:keyValue)
        {
            System.out.println("Argument = " + x[0] + " Tangent of this argument:"+x[1]);
        }
    };
}
