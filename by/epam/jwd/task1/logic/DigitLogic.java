package by.epam.jwd.task1.logic;

public class DigitLogic {
    public static int getLastDigitOfSquaredNumber(int number) {
        int lastdigit = number % 10;//сделано с целью работы с большими числами
        int squaredlastdigit = lastdigit * lastdigit;
        return squaredlastdigit % 10;
    }
}
