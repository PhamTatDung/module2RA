import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double C;
        double S;
        System.out.println(
                "Menu: \n"+
                "\t 1.Tính chu vi và diện tích hình chữ nhật .\n" +
                "\t 2.Tính chu vi và diện tích hình tam giác\n" +
                "\t 3.Tính chu vi và diện tích hình tròn.\n" +
                "\t 4.Thoát\n");
        int choose;
        do{
            System.out.println("Nhap Lua Chon Theo Menu:");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhap vao chieu dai hinh chu nhat: ");
                    double a = sc.nextInt();
                    System.out.println("Nhap vao chieu rong hinh chu nhat: ");
                    double b = sc.nextInt();
                    C = (a+b)*2;
                    S = a*b;
                    System.out.println("Chu Vi Hinh Chu Nhat: "+C);
                    System.out.println("Dien Tich Hinh Chu Nhat: "+S);
                    break;
                case 2:
                    System.out.println("Nhap vao do dai canh 1: ");
                    int a1 = sc.nextInt();
                    System.out.println("Nhap vao do dai canh 2: ");
                    int a2 = sc.nextInt();
                    System.out.println("Nhap vao do dai canh 3: ");
                    int a3 = sc.nextInt();
                    C = a1+a2+a3;
                    double p = C/2;
                    System.out.println(p);
                    S = Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
                    System.out.println("Chu Vi Hinh Tam Giac La: "+ C);
                    System.out.println("Dien Tich Hinh Tam Giac La: "+ S);
                    break;
                case 3:
                    final double PI = 3.14;
                    System.out.println("nhap vao ban kinh hinh tron: ");
                    double r = sc.nextInt();
                    C = 2*PI*r;
                    S = PI*(r*r);
                    System.out.println("Chu Vi Hinh Tron: "+C);
                    System.out.println("Dien Tich Hinh Tron: "+S);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("warring: Nhap Sai!");
            }
        }
        while(choose!=4);
    }
}
