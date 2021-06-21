package by.epamtc.voloshchik.task3.subtask2.service;

public class MaxSumOfEachRowSort implements Sorter{
    public void sort(int[][] array, boolean ascendingOrder) {
        if(array == null || array.length == 0)
        {
            return;
        }
        int[] arrayOfRowsSums = composeArrayOfRowsSums(array);
        SortingLogic.sort(array,arrayOfRowsSums,ascendingOrder);
    }
    private int[] composeArrayOfRowsSums(int[][] array)
    {
        int[] rowsSums = new int[array.length];
        for(int i = 0;i<array.length;++i)
        {
            for(int j = 0;j<array[i].length;++j)
            {
                rowsSums[i] += array[i][j];
            }
        }
        return rowsSums;
    }
}
