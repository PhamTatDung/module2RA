import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in");
        int numbers = sc.nextInt();
        int count = 0;
        int n = 2;
        System.out.print(numbers + " so nguyen to dau tien la: ");
        do {
            if (n == 2) {
                System.out.print(n + " ");
                count++;
            }
            n++;
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
                count++;
            }
        }
        while (count < numbers);
    }
}
