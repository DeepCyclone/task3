package by.epamtc.voloshchik.task1.logic;

public class DigitLogic {
    public static int calculateLastDigitOfSquaredNumber(int number) {
        int lastDigit = number % 10;
        int squaredLastDigit = lastDigit * lastDigit;
        return squaredLastDigit % 10;
    }
}
