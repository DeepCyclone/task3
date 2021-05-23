package by.epamtc.voloshchik.task5.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task5.logic.NumberLogic;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        System.out.println("Enter number to check if it's ideal");
        int number = sc.inputPositiveInteger();
        System.out.println(NumberLogic.isNumberIdeal(number) == true?
                "Entered number is ideal":
                "Entered number isn't ideal");
    }
}
