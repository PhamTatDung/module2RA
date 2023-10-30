import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  n = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Nhap phan tu muon xoa: ");
        int x = sc.nextInt();
        for (int i = 0; i < n.length; i++) {
            if (n[i] == x){
                for (int j = i; j < n.length-1; j++) {
                    n[j] = n[j + 1];
                }
            }
        }
        System.out.println("Mang moi sau khi xoa la: "+ Arrays.toString(n));
    }
}
