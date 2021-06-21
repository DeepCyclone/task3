package by.epamtc.voloshchik.task3.subtask2.service;

public class MaxElementOnEachRowSort implements Sorter{
    public void sort(int[][] array, boolean ascendingOrder) {
        if(array == null || array.length == 0)
        {
            return;
        }
        int[] arrayOfMaxElementsPerRow = composeArrayOfMaxElementsInRows(array);
        SortingLogic.sort(array,arrayOfMaxElementsPerRow,ascendingOrder);
    }
    private int[] composeArrayOfMaxElementsInRows(int[][] array)
    {
        int[] maxElementsInRows = new int[array.length];
        for(int i = 0;i<array.length;++i)
        {
            int maxElementInRow = array[i][0];
            for(int j = 1;j<array[i].length;++j)
            {
                if(array[i][j] > maxElementInRow)
                {
                    maxElementInRow = array[i][j];
                }
            }
            maxElementsInRows[i] = maxElementInRow;
        }
        return maxElementsInRows;
    }
}
