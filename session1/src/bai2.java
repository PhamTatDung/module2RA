import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        double rate = 23000.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"Nhap So Tien Muon Chuyen Doi:\"");
        double usd  = scanner.nextDouble();
        double vnd = rate*usd;
        System.out.print("\"Gia tri VND tuong ung:\" ");
        System.out.print(vnd);
        System.out.print("vnd");
    }
}
