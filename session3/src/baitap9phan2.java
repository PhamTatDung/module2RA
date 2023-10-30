import java.util.Scanner;

public class baitap9phan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào: ");
        String str = scanner.nextLine();
        System.out.println("Nhập chuỗi con: ");
        String subStr = scanner.nextLine();
        boolean flag = str.contains(subStr);
        if (flag){
            System.out.printf("chuỗi \"%s\" có chứa \"%s\"", str, subStr);
        }
        else {
            System.out.printf("chuỗi \"%s\" không chứa \"%s\"", str, subStr);
        }
    }
}
