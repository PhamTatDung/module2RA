package baitap1_13;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3, 4, 3, 2, 4, 5, 4, 3, 6, 7, 3, 1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int element : array) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        System.out.println("Số lần xuất hiện của từng phần tử:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Phần tử " + entry.getKey() + ": " + entry.getValue() + " lần");
        }
    }
}
