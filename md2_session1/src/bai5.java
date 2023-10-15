import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Diem Toan:");
        double toan = scanner.nextDouble();
        System.out.println("Nhap Diem Ly:");
        double ly = scanner.nextDouble();
        System.out.println("Nhap Diem Hoa:");
        double hoa = scanner.nextDouble();
        System.out.println("Nhap Diem Van:");
        double van = scanner.nextDouble();
        System.out.println("Nhap Diem Anh:");
        double anh = scanner.nextDouble();
        double tb = (toan+ly+hoa+van+anh)/5;
        if (tb<5){
            System.out.print("Diem Trung Binh La: ");
            System.out.println(tb);
            System.out.print("Xep Loai Yeu");
        } else if (tb>=5&&tb<6.5) {
            System.out.print("Diem Trung Binh La: ");
            System.out.println(tb);
            System.out.print("Xep Loai Trung Binh");
        } else if (tb>=6.5&&tb<8) {
            System.out.print("Diem Trung Binh La: ");
            System.out.println(tb);
            System.out.print("Xep Loai Kha");
        } else if (tb>=8&&tb<9) {
            System.out.print("Diem Trung Binh La: ");
            System.out.println(tb);
            System.out.print("Xep Loai Gioi");
        } else if (tb>=9) {
            System.out.print("Diem Trung Binh La: ");
            System.out.println(tb);
            System.out.print("Xep Loai Xuat Sac");
        }
    }
}
