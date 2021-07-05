package by.epamtc.voloshchik.task3.subtask1.services;

import by.epamtc.voloshchik.task3.subtask1.bean.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayService {
    public static int binarySearch(Array array,int element) {
        return BinarySearch.search(array,element);
    }
    public static int findMin(Array array) {
        if(array == null) {
            return Integer.MAX_VALUE;
        }
        int minimalNumber = array.getElement(0);
        for(int i = 1;i < array.getCapacity();i++) {
            int element = array.getElement(i);
            if(element < minimalNumber) {
                minimalNumber = element;
            }
        }
        return minimalNumber;
    }
    public static int findMax(Array array) {
        if(array == null) {
            return Integer.MAX_VALUE;
        }
        int maximalNumber = array.getElement(0);
        for(int i = 1;i<array.getCapacity();i++) {
            int element = array.getElement(i);
            if(element > maximalNumber) {
                maximalNumber = element;
            }
        }
        return maximalNumber;
    }
    public static int[] findAllPrimes(Array array) {
        if(array == null) {
            return null;
        }
        ArrayList<Integer> primesBuffer = new ArrayList<>();
        for(int number:array) {
            if(PrimeNumbersSearcher.isPrime(number)) {
                primesBuffer.add(number);
            }
        }
        int[] primes = new int[primesBuffer.size()];
        ArrayService.copyData(primes,array);
        return primes;
    }
    public static int[] findAllFibonacciNumbers(Array array) {
        if(array == null) {
            return null;
        }
        ArrayList<Integer> fibsBuffer = new ArrayList<>();
        for(int number:array) {
            if(FibonacciNumbersSearcher.isFibonacciNumber(number)) {
                fibsBuffer.add(number);
            }
        }
        int[] fibs = new int[fibsBuffer.size()];
        ArrayService.copyData(fibsBuffer,array);
        return fibs;
    }
    public static int[] findAllUniqueThreeDigitNumbers(Array array) {
        if(array == null) {
            return null;
        }
        ArrayList<Integer> numbersBuffer = new ArrayList<Integer>();
        for(int number:array) {
            if(UniqueThreeDigitNumberFinder.isUnique(number)) {
                numbersBuffer.add(number);
            }
        }
        int[] uniqueNumbers = new int[numbersBuffer.size()];
        ArrayService.copyData(numbersBuffer,array);
        return uniqueNumbers;
    }
    public static void copyData(int[] source,Array destination) {
        int dataSize = Math.min(source.length, destination.getCapacity());
        for(int i = 0;i < dataSize;++i) {
            destination.setElement(i,source[i]);
        }
    }
    public static void copyData(List<Integer> source,Array destination) {
        int dataSize = Math.min(source.size(), destination.getCapacity());
        for(int i = 0;i < dataSize;++i) {
            destination.setElement(i,source.get(i));
        }
    }
}
