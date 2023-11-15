package baitap3_12;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập số từ muốn thêm");
        int numberOfWord = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfWord; i++) {
            System.out.println("Hãy Nhập Từ Muốn Thứ "+(i+1));
            String word = sc.nextLine();
            stack.push(word);
        }
        System.out.println("Văn bản ngược là: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
