package by.epamtc.voloshchik.task3.subtask1.services;

public class InsertionSort implements Sorter{
    @Override
    public void sort(int[] array) {
        for(int i = 1;i<array.length;i++)
        {
            int ind = i;
            while(ind > 0 && array[ind - 1] > array[ind])
            {
                int tmp = array[ind-1];
                array[ind-1] = array[ind];
                array[ind] = tmp;
                ind--;
            }
        }
    }
}
