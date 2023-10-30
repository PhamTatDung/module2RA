import java.util.Scanner;

public class baitap3phan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào: ");
        String str = sc.nextLine();
        System.out.println("Chuỗi đầu vào: "+str);
        StringBuffer stringBuffer = new StringBuffer(str);
        str = stringBuffer.reverse().toString();
        System.out.println("Chuỗi đảo ngược: "+str);
    }
}
