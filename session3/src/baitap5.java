import java.util.Arrays;
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Vào Độ Dài Của Mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập Vào Phần Tử Thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá Trị Nhỏ Nhất Trong Mảng Vừa Nhập Là: " + min);
    }
}
