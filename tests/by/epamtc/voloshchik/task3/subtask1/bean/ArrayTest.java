package by.epamtc.voloshchik.task3.subtask1.bean;

import by.epamtc.voloshchik.task3.subtask1.services.BubbleSort;
import by.epamtc.voloshchik.task3.subtask1.services.InsertionSort;
import by.epamtc.voloshchik.task3.subtask1.services.SelectionSort;
import org.junit.Assert;
import org.junit.Test;


public class ArrayTest {



    @Test(expected = NegativeArraySizeException.class)
    public void testCreatingShellWithNegativeCapacity() {
        Array array = new Array(-5);
        int expected = 5;
        int actual = array.getCapacity();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getElementTest() {
        Array array = new Array(new int[]{15,20,25,30,35,40});
        int expected = 15;
        int actual = array.getElement(0);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementByNonExistentIndexTest() {
        Array array = new Array(new int[]{15,20,25,30,35,40});
        int expected = 15;
        int actual = array.getElement(55);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void setElementByNonExistentIndexTest() {
        Array array = new Array(new int[]{15,20,25,30,35,40});
        int expected = 28;
        array.setElement(15,28);
        int actual = array.getElement(0);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setElementTest() {
        Array array = new Array(new int[]{15,20,25,30,35,40});
        int expected = 28;
        array.setElement(0,28);
        int actual = array.getElement(0);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeElementTest() {
        Array array = new Array(new int[]{1,2,3});
        Array expected = new Array(new int[]{2,3,0});
        array.removeElement(0);
        Assert.assertEquals(array,expected);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeElementByNonExistentIndexTest() {
        Array array = new Array(new int[]{1,2,3});
        Array expected = new Array(new int[]{2,3,0});
        array.removeElement(55);
        Assert.assertEquals(array,expected);
    }

    @Test
    public void bubbleSortTest() {
        Array array = new Array(new int[]{3,2,1});
        Array sorted = new Array(new int[]{1,2,3});
        array.sort(new BubbleSort());
        Assert.assertEquals(sorted,array);
    }
    @Test
    public void insertionSortTest() {
        Array array = new Array(new int[]{3,2,1});
        Array sorted = new Array(new int[]{1,2,3});
        array.sort(new InsertionSort());
        Assert.assertEquals(sorted,array);
    }
    @Test
    public void selectionSortTest() {
        Array array = new Array(new int[]{3,2,1});
        Array sorted = new Array(new int[]{1,2,3});
        array.sort(new SelectionSort());
        Assert.assertEquals(sorted,array);
    }
    @Test
    public void getCapacityTest() {
        Array array = new Array(15);
        int expected = 15;
        int actual = array.getCapacity();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void indexOfTest() {
        Array array = new Array(new int[]{1,2,3,4,5});
        int expected = 2;
        int actual = array.indexOf(3);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void indexOfNonExistentElementTest() {
        Array array = new Array(new int[]{1,2,3,4,5});
        int expected = -1;
        int actual = array.indexOf(15);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testEquals() {
        Array array1 = new Array(new int[]{1,2,3});
        Array array2 = new Array(new int[]{1,2,3});
        Assert.assertTrue(array1.equals(array2));
    }

    @Test
    public void testHashCode() {
        Array array = new Array(new int[]{1,2,3});
        int expected = 955330;
        int actual = array.hashCode();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        Array array = new Array(new int[]{1,2,3});
        String expected = "Array\n" +
                "elements:\n" +
                "array[0] = 1\n" +
                "array[1] = 2\n" +
                "array[2] = 3\n";
        String actual = array.toString();
        Assert.assertEquals(expected,actual);
    }
}