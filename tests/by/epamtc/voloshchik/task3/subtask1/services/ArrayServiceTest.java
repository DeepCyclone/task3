package by.epamtc.voloshchik.task3.subtask1.services;

import by.epamtc.voloshchik.task3.subtask1.bean.Array;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayServiceTest {
    private Array array;

    @Before
    public void initArray() {
        array = new Array(new int[]{1,2,3,4,5});
    }

    @Test
    public void binarySearch() {
        int expected = 3;
        int actual = ArrayService.binarySearch(array,4);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void binarySearchOfNonExistentElement() {
        int expected = -1;
        int actual = ArrayService.binarySearch(array,25);
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void binarySearchOnShortArray() {
        Array shortArray = new Array(new int[]{1});
        int expected = 0;
        int actual = ArrayService.binarySearch(shortArray,1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void binarySearchOfFirstElement() {
        int expected = 0;
        int actual = ArrayService.binarySearch(array,1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void binarySearchOfLastElement() {
        int expected = 4;
        int actual = ArrayService.binarySearch(array,5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findMin() {
        int expected = 1;
        int actual = ArrayService.findMin(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findMax() {
        int expected = 5;
        int actual = ArrayService.findMax(array);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findAllPrimes() {
        int[] expected = new int[]{2,3,5};
        int[] actual = ArrayService.findAllPrimes(array);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void findAllFibonacciNumbers() {
        int[] expected = new int[]{1,2,3,5};
        int[] actual = ArrayService.findAllFibonacciNumbers(array);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void findAllUniqueThreeDigitNumbers() {
        Array testArray = new Array(new int[]{124,455,678,232});
        int[] expected = new int[]{124,678};
        int[] actual = ArrayService.findAllUniqueThreeDigitNumbers(testArray);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testCopyDataFromIntArray() {
        Array array = new Array();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        ArrayService.copyData(arr,array);
        Array expected = new Array(new int[]{1,2,3,4,5});
        Assert.assertEquals(expected,array);
    }
    @Test
    public void testCopyDataFromList() {
        Array array = new Array();
        List<Integer> source = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayService.copyData(source,array);
        Array expected = new Array(new int[]{1,2,3,4,5});
        Assert.assertEquals(expected,array);
    }
}