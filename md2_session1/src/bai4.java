import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Chieu Dai:");
        double d = scanner.nextDouble();
        System.out.println("Nhap Chieu Rong:");
        double r = scanner.nextDouble();
        double cv = (d+r)*2;
        double dt = (d*r);
        System.out.print("Chu Vi Cua Hinh Chu Nhat La: ");
        System.out.println(cv);
        System.out.print("Dien Tich Cua Hinh Chu Nhat La: ");
        System.out.println(dt);
    }
}
