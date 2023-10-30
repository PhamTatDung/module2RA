import java.util.Arrays;
import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[4];
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập Vào Giá Trị Thứ " + (i + 1) + " của mảng 1:");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập Vào Giá Trị Thứ " + (i + 1) + " của mảng 2:");
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mảng 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Mảng 2: ");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Mảng Đã Gộp: ");
        System.out.println(Arrays.toString(arr3));
    }
}
