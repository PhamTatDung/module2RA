import java.util.Arrays;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        n[0] = 10;
        n[1] = 4;
        n[2] = 6;
        n[3] = 7;
        n[4] = 8;
        System.out.println("Nhập số muốn chèn:");
        int x = sc.nextInt();
        int index;
        System.out.println("Nhập vào vị trí:");
        index = sc.nextInt();
        while (index < 0 || index >= n.length) {
            System.out.println("Nhập lại vị trí:");
            index = sc.nextInt();
        }
        for (int i = n.length - 1; i > index; i--) {
            n[i] = n[i - 1];
        }
        n[index] = x;
        System.out.println(Arrays.toString(n));

    }
}
