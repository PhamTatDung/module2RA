import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Vao So Can Kiem Tra: ");
        int check = scanner.nextInt();
        if (check%3==0&&check%5==0){
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (check%3==0&&check%5!=0) {
            System.out.println("Chỉ chia hết cho 3");
        } else if (check%3!=0&&check%5==0) {
            System.out.println("Chỉ chia hết cho 5");
        }
        else {
            System.out.println("Không chia hết cho 3 , cũng không chia hết cho 5");
        }
    }
}
