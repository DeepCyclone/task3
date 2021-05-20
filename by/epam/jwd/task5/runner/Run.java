package by.epam.jwd.task5.runner;

import by.epam.jwd.scanner.ScannerLogic;
import by.epam.jwd.task5.logic.NumberLogic;

public class Run {
    public static void main(String[] args)
    {
        ScannerLogic sc = new ScannerLogic();
        System.out.println("Введите число.Будет произвдена проверка на его совершенность:");
        int number = sc.inputPositiveInteger();
        NumberLogic.checkIdealStatus(number);
    }
}
