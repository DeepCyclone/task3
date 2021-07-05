package by.epamtc.voloshchik.task3.subtask1.services;

public class SelectionSort implements Sorter{
    @Override
    public void sort(int[] array) {
        for(int i = 0;i < array.length;i++)
        {
            int min = array[i];
            int idMin = i;
            for(int j = i+1; j < array.length; j++)
            {
                if(array[j] < min)
                {
                    min = array[j];
                    idMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[idMin];
            array[idMin] = temp;
        }
    }
}
