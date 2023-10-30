import java.util.Arrays;
import java.util.Scanner;

public class baitap4phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chuỗi Đầu Vào: ");
        String str = sc.nextLine();
        String[] word = str.split(" ");
        System.out.println(Arrays.toString(word));
    }
}
