package by.epamtc.voloshchik.task4.runner;

import by.epamtc.voloshchik.scanner.InputLogic;
import by.epamtc.voloshchik.task4.logic.CheckLogic;

public class Run {
    public static void main(String[] args)
    {
        InputLogic sc = new InputLogic();
        int a,b,c,d;
        System.out.println("Enter four numbers");
        System.out.println("a:");
        a = sc.inputInteger();
        System.out.println("b:");
        b = sc.inputInteger();
        System.out.println("c:");
        c = sc.inputInteger();
        System.out.println("d:");
        d = sc.inputInteger();
        System.out.println(CheckLogic.isTwoNumsEven(a,b,c,d)?
                "At least two numbers of this list are even":
                "There are less of two even numbers in this list");
    }
}
