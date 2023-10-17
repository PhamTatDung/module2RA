import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double C;
        double S;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nap vao canh 1: ");
            a = sc.nextInt();
            System.out.println("Nap vao canh 2: ");
            b = sc.nextInt();
            System.out.println("Nap vao canh 3: ");
            c = sc.nextInt();
            boolean check1 = (a > 0) && (b > 0) && (c > 0);
            boolean check2 = ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
            if (check1 && check2) {
                C = a + b + c;
                double p = C / 2;
                S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Chu vi hinh tron la: "+C);
                System.out.println("Dien Tich Hinh Tron La: "+S);
                break;
            } else {
                System.out.println("warring: Hay Nhap Cac Canh Dung Dieu Kien: ");
            }
        }
    }
}
