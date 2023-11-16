package baitap4;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    //bubbleSort 1 tham so
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length && check; i++) {
            check = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
        }
    }

    //bubbleSort 2 tham so
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        boolean check = true;
        for (int i = 1; i < arr.length && check; i++) {
            check = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
        }

    }

    //selectionSort 1 tham so
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            T currentMin = arr[i];
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(currentMin) > 0) {
                    currentMin = arr[j];
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                arr[indexMin] = arr[i];
                arr[i] = currentMin;
            }
        }
    }

    //selectionSort 2 tham so
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            T currentMin = arr[i];
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[j], currentMin) < 0) {
                    currentMin = arr[j];
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                arr[indexMin] = arr[i];
                arr[i] = currentMin;
            }
        }
    }

    //insertionSort 1 tham so
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T currentInsert = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j].compareTo(currentInsert) < 0; j--) {
                arr[j + 1] = arr[j];
            }
            // chèn giá trị hiện tại vào vị trí j
            arr[j + 1] = currentInsert;
        }
    }
    //insertionSort 2 tham so
    public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
        for (int i = 1; i < arr.length; i++) {
            T currentInsert = arr[i];
            int j;
            for (j = i - 1; j >= 0 && comparator.compare(arr[j], currentInsert) > 0; j--) {
                arr[j + 1] = arr[j];
            }
            // chèn giá trị hiện tại vào vị trí j
            arr[j + 1] = currentInsert;
        }
    }
}
