package by.epamtc.voloshchik.scanner;

import java.util.Scanner;

public class InputLogic {
    private final static int SECONDS_IN_DAY = 86400;
    private Scanner sc;
    public InputLogic() {
        sc = new Scanner(System.in);
    }
    public int inputInteger() {
        while(!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Enter integer:");
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
            System.out.println("Enter double:");
        }
        return sc.nextDouble();
    }
    public double inputPositiveDouble() {
        double number = 0;
        do {
            number = inputDouble();
        }while(number <=0);
        return number;
    }
    public int inputMonth() {
        int month = 0;
        do {
            System.out.println("Enter sequential number of month");
            month = inputPositiveInteger();
        }while(month > 12);
        return month;
    }
    public int inputSecondOfDay()
    {
        int second = 0;
        do {
            System.out.println("Input second");
            second = inputPositiveInteger();
        }while (second >= SECONDS_IN_DAY);
        return second;
    }
}
