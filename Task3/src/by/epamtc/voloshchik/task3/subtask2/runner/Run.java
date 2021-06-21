package by.epamtc.voloshchik.task3.subtask2.runner;

import by.epamtc.voloshchik.task3.subtask2.presentation.JaggedArrayViewer;
import by.epamtc.voloshchik.task3.subtask2.service.JaggedArrayService;
import by.epamtc.voloshchik.task3.subtask2.service.MaxElementOnEachRowSort;
import by.epamtc.voloshchik.task3.subtask2.service.MaxSumOfEachRowSort;
import by.epamtc.voloshchik.task3.subtask2.service.MinElementOnEachRowSort;

import java.util.Arrays;
import java.util.Comparator;

public class Run {
    public static void main(String[] args)
    {
        int[][] jagged = {
                {9,8,1,19},
                {6,4,5},
                {12,7,8,9}
        };
//        JaggedArrayService.BubbleSort(jagged,new MaxElementOnEachRowSort(),true);
//        JaggedArrayService.BubbleSort(jagged,new MinElementOnEachRowSort(),true);
        JaggedArrayService.BubbleSort(jagged,new MaxSumOfEachRowSort(),false);
        JaggedArrayViewer.printArray(jagged);
    }
}
