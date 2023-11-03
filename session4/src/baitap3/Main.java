package baitap3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Random random = new Random();
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt(100000);
        }
        System.out.println("mang ban dau: ");
        System.out.println(Arrays.toString(array));
        stopWatch.star();
        System.out.println(stopWatch.star());
        stopWatch.selectionSort(array);
        stopWatch.end();
        System.out.println(stopWatch.end());
        System.out.println("thoi gian chay thuan toan: " + stopWatch.getElapsedTime() + "milliseconds");

//        System.out.println(System.currentTimeMillis());
    }
}
