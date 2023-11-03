package baitap3;

import java.util.Arrays;

public class StopWatch {
    private long starTime;
    private long endTime;


    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long star() {
        starTime = System.currentTimeMillis();
        return starTime;
    }

    public long end() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - starTime;
    }
    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
                if (minIndex != i){
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
        System.out.println("mang sau khi sap xep: ");
        System.out.println(Arrays.toString(arr));
    }
}
