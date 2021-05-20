package by.epam.jwd.scanner;

import java.util.Scanner;

public class ScannerLogic {
    private Scanner sc;
    public int inputInteger()
    {
        while(!sc.hasNextInt())
        {
            sc.nextLine();
        }
        return sc.nextInt();
    }
    public int inputPositiveInteger()
    {
        while(!sc.hasNextInt())
        {
            sc.nextLine();
        }
        return Math.abs(sc.nextInt());
    }
    public double inputDouble()
    {
        while(!sc.hasNextDouble())
        {
            sc.nextLine();
        }
        return sc.nextDouble();
    }
    public double inputPositiveDouble()
    {
        while(!sc.hasNextDouble() && sc.nextDouble() <= 0)
        {
            sc.nextLine();
        }
        return Math.abs(sc.nextDouble());
    }
    public ScannerLogic() {
        sc = new Scanner(System.in);
    }
}
