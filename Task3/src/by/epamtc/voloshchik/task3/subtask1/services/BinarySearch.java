package by.epamtc.voloshchik.task3.subtask1.services;

import by.epamtc.voloshchik.task3.subtask1.bean.Array;

public class BinarySearch{
    public static int search(Array array, int element)
    {
        int leftBorder = 0;
        int rightBorder = array.getCapacity();
        while(leftBorder <= rightBorder)
        {
            int mid = (rightBorder + leftBorder) / 2;
            if(array.getElement(mid) < element)
            {
                leftBorder = mid + 1;
            }
            else if(array.getElement(mid) > element)
            {
                rightBorder = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
