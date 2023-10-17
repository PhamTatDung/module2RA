import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        int sum = 0;
        do {
            System.out.println("Nhap Vao So Bat Dau: ");
            start = sc.nextInt();
            System.out.println("Nhap Vao So Ket Thuc: ");
            end = sc.nextInt();
        } while (start > end);
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong Cac So Chan Trong Khoang Tu " + start + " Den " + end + " la: "+sum);
    }
}
