package by.epamtc.voloshchik.task3.subtask2.service;

public class MinElementOnEachRowSort implements Sorter{
    public void sort(int[][] array, boolean ascendingOrder) {
        if(array == null || array.length == 0) {
            return;
        }
        int[] arrayOfMinElementsPerRow = composeArrayOfMinElementsInRows(array);
        SortingLogic.sort(array,arrayOfMinElementsPerRow,ascendingOrder);
    }
    private int[] composeArrayOfMinElementsInRows(int[][] array) {
        int[] minElementsInRows = new int[array.length];
        for(int i = 0;i < array.length;++i) {
            int minElementInRow = array[i][0];
            for(int j = 1;j < array[i].length;++j) {
                if(array[i][j] < minElementInRow) {
                    minElementInRow = array[i][j];
                }
            }
            minElementsInRows[i] = minElementInRow;
        }
        return minElementsInRows;
    }
}
