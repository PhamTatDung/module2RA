import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "acsasea";
        System.out.println("Nhập vào giá trị cần kiểm tra");
        char character = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character){
                count++;
            }
        }
        System.out.println("kí tự "+character+" xuất hiện: "+count+" lần");

    }
}
