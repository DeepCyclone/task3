package by.epamtc.voloshchik.task3.subtask1.services;

import by.epamtc.voloshchik.task3.subtask1.bean.Array;
import by.epamtc.voloshchik.task3.subtask1.exceptions.ArrayCapacityLackException;
import by.epamtc.voloshchik.task3.input.InputLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ArrayFiller {
    private static Random rand = new Random();
    private static final String PATH = "src" + File.separator + "resources" + File.separator + "data.txt";
    public static void fillManual(Array array) throws ArrayCapacityLackException {
        InputLogic scanner = new InputLogic(new Scanner(System.in));
        if(!isArrayCapableToAddElements(array)) {
            throw new ArrayCapacityLackException();
        }
        for(int i = 0;i < array.getCapacity();++i) {
            array.setElement(i,scanner.inputInteger());
        }
    }
    public static void fillWithRandomSequence(Array array) throws ArrayCapacityLackException {
        if(!isArrayCapableToAddElements(array)) {
            throw new ArrayCapacityLackException();
        }
        for(int i = 0;i<array.getCapacity();++i) {
            array.setElement(i,rand.nextInt());
        }
    }
    public static void fillFromFile(Array array) throws FileNotFoundException,ArrayCapacityLackException {
        if(!isArrayCapableToAddElements(array)) {
            throw new ArrayCapacityLackException();
        }
        File f;
        Scanner sc = null;
        try {
            f = new File(PATH);
            sc = new Scanner(f);
            for(int i = 0;i < array.getCapacity() && sc.hasNextInt();++i){
                array.setElement(i,sc.nextInt());
            }
        }
        catch (FileNotFoundException e) {
            throw e;
        }
        finally {
            if(sc!=null) {
                sc.close();
            }
        }

    }
    private static boolean isArrayCapableToAddElements(Array array) {
        boolean isCapable = false;
        if(array != null && array.getCapacity() > 0) {
            isCapable = true;
        }
        return isCapable;
    }
}
