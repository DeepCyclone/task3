package by.epamtc.voloshchik.task3.subtask1.bean;

import by.epamtc.voloshchik.task3.subtask1.services.ArrayService;
import by.epamtc.voloshchik.task3.subtask1.services.Sorter;

import java.io.Serializable;
import java.util.*;

public class Array implements Iterable<Integer>, Serializable {
    private int[] array;
    public static final int DEFAULT_CAPACITY = 5;
    public Array() {
        this(DEFAULT_CAPACITY);
    }
    public Array(int capacity) {
        array = new int[capacity];
    }
    public Array(int[] array) {
        this(array.length);
        ArrayService.copyData(array,this);
    }
    public Array(List<Integer> array) {
        this(array.size());
        ArrayService.copyData(array,this);
    }
    public int getElement(int index) {
        appropriateIndexCheck(index);
        return array[index];
    }
    public void setElement(int index,int element) {
        appropriateIndexCheck(index);
        array[index] = element;
    }
    public int removeElement(int index) {
        appropriateIndexCheck(index);
        int deletedElement = array[index];
        for(int i = index;i < array.length - 1;i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        return deletedElement;
    }
    public void sort(Sorter sorter){
        sorter.sort(array);
    }
    public int getCapacity() {
        return array.length;
    }
        /**
         * @return
         * index of transmitted element
         * the first occurrence of transmitted element(in case of a same elements)
         */
    public int indexOf(int element) {
        int index = -1;
        for(int i = 0;i < array.length;++i) {
            if(array[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;
        Array that = (Array)obj;
        if(that.getCapacity() != getCapacity())return false;
        for(int i = 0;i<getCapacity();++i) {
            if(that.getElement(i) != array[i]) {
                return false;
            }
        }
        return true;
    }
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        for(int number:array){
            result = result * prime + number;
        }
        result = result * prime + array.length;
        return result;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + "\n");
        sb.append("elements:" + "\n");
        for(int i = 0;i < array.length;i++) {
            sb.append("array["+ i +"] = " + array[i] + "\n");
        }
        return sb.toString();
    }
    private void appropriateIndexCheck(int index) {
        if(index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Out of bounds - Actual array size:" + array.length + "|" + "Contacted index:" + index);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int cursorPosition = 0;
            @Override
            public boolean hasNext() {
                return cursorPosition < array.length;
            }
            @Override
            public Integer next() {
                return array[cursorPosition++];
            }
        };
        };
    }
