package by.epamtc.voloshchik.task3.subtask2.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JaggedArrayServiceTest {

    @Test
    public void bubbleSortByMinElementOfEachRow() {
        int[][] array = new int[][]{
                {1,2},
                {5,10,3},
                {0,4,6}
        };
        int[][] expected = new int[][]{
                {0,4,6},
                {1,2},
                {5,10,3}
        };
        JaggedArrayService.BubbleSort(array,new MinElementOnEachRowSort(),true);
        Assert.assertArrayEquals(expected,array);
    }

    @Test
    public void bubbleSortByMaxElementOfEachRow() {
        int[][] array = new int[][]{
                {1,2},
                {5,10,3},
                {0,4,6}
        };
        int[][] expected = new int[][]{
                {1,2},
                {0,4,6},
                {5,10,3}
        };
        JaggedArrayService.BubbleSort(array,new MaxElementOnEachRowSort(),true);
        Assert.assertArrayEquals(expected,array);
    }

    @Test
    public void bubbleSortByMaxSumOfEachRow() {
        int[][] array = new int[][]{
                {1,15,7},
                {5,10,3},
                {0,4,6}
        };
        int[][] expected = new int[][]{
                {0,4,6},
                {5,10,3},
                {1,15,7}
        };
        JaggedArrayService.BubbleSort(array,new MaxSumOfEachRowSort(),true);
        Assert.assertArrayEquals(expected,array);
    }

    @Test
    public void testRowsSwap() {
        int[][] array = new int[][]{{1,2,3},{3,2,1}};
        JaggedArrayService.swap(array,0,1);
        int[][] expected = new int[][]{{3,2,1},{1,2,3}};
        Assert.assertArrayEquals(expected,array);
    }

    @Test
    public void testElementsSwap() {
        int[] row = new int[]{1,2,3};
        JaggedArrayService.swap(row,0,1);
        int[] expected = new int[]{2,1,3};
        Assert.assertArrayEquals(expected,row);
    }
}