package by.epamtc.voloshchik.task3.subtask2.presentation;

public class JaggedArrayViewer {
    public static void printArray(int[][] array) {
        if(array == null) {
            return;
        }
        for(int i = 0;i<array.length;++i) {
            for(int j = 0;j < array[i].length;++j) {
                System.out.print("Array["+i+"]"+"["+j+"]=" + array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
