package by.epamtc.voloshchik.task3.subtask2.service;

public class SortingLogic {
    public static void sort(int[][] array,int[] compareArray,boolean ascendingOrder)
    {
        if(array == null || array.length == 0)
        {
            return;
        }
        for(int i = 0;i < array.length - 1;i++) {
            for(int j = 0; j < array.length - i - 1;j++) {
                if(((compareArray[j] > compareArray[j + 1]) && ascendingOrder) ||
                        ((compareArray[j] < compareArray[j + 1]) && !ascendingOrder)) {
                    JaggedArrayService.swap(array,j,j+1);
                    JaggedArrayService.swap(compareArray,j,j+1);
                }
            }
        }
    }
}
