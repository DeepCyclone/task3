package by.epamtc.voloshchik.task3.logic;

public class CalculationLogic {
    public static double calculateInscribedSquareArea(double side)
    {
        double inscribedCircleDiametr = side;
        double squareArea = Math.pow(inscribedCircleDiametr,2) / 2;
        return squareArea;
    }
    public static double calculateAreasRatio(double side)
    {
        double squareArea = side * side;
        double inscribedSquareArea = calculateInscribedSquareArea(side);
        return squareArea / inscribedSquareArea;
    }
}
