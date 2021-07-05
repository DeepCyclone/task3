package by.epamtc.voloshchik.task3.subtask1.services;

public class UniqueThreeDigitNumberFinder {
    public static boolean isUnique(int number) {
        if(number < 100 || number > 999) {
            return false;
        }
        boolean state = false;
        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = number % 10;
        if((firstDigit != secondDigit) &&
                (firstDigit != thirdDigit) &&
                (secondDigit != thirdDigit)) {
            state = true;
        }
        return state;
    }
}
