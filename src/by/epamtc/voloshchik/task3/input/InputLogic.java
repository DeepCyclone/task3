package by.epamtc.voloshchik.task3.input;

import java.util.Scanner;

public class InputLogic {
    private Scanner sc;
    public InputLogic(Scanner sc) {
        this.sc = sc;
    }
    public int inputInteger() {
        while(!sc.hasNextInt()) {
            sc.nextLine();
        }
        return sc.nextInt();
    }
    public int inputPositiveInteger() {
        int number = 0;
        do {
            number = inputInteger();
        }while(number <= 0);
        return number;
    }
    public double inputDouble() {
        while(!sc.hasNextDouble()) {
            sc.nextLine();
        }
        return sc.nextDouble();
    }
    public double inputPositiveDouble() {
        double number = 0;
        do {
            number = inputDouble();
        }while(number <= 0);
        return number;
    }
}
