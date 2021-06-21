package by.epamtc.voloshchik.task3.subtask2.service;

import java.util.Comparator;

public class JaggedArrayService{
    public static void BubbleSort(int[][] jaggedArray,Sorter sorter,boolean ascendingOrder)
    {
        if(jaggedArray == null || jaggedArray.length == 0)
        {
            return;
        }
        sorter.sort(jaggedArray,ascendingOrder);
    }
    public static void swap(int [][] array,int firstRowIndex,int secondRowIndex) {
        int [] tmp = array[firstRowIndex];
        array[firstRowIndex] = array[secondRowIndex];
        array[secondRowIndex] = tmp;
    }
    public static void swap(int[] array,int firstValueIndex,int secondValueIndex)
    {
        int tmp = array[firstValueIndex];
        array[firstValueIndex] = array[secondValueIndex];
        array[secondValueIndex] = tmp;
    }
}
