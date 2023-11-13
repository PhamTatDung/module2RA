package baitap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numb = (int) (Math.random()*100);
            integerList.add(numb);
        }
        System.out.println("List số nguyên ngẫu nhiên là:");
        System.out.println(integerList);
        System.out.println("Phần tử lớn nhất trong mảng vừa tạo là: "+ Collections.max(integerList));
    }
}
