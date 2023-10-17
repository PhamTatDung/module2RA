import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can kiem tra; ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("So mot");
                break;
            case 2:
                System.out.println("So Hai");
                break;
            case 3:
                System.out.println("So Ba");
                break;
            case 4:
                System.out.println("So Bon");
                break;
            case 5:
                System.out.println("So Nam");
                break;
            case 6:
                System.out.println("So sau");
                break;
            case 7:
                System.out.println("So Bay");
                break;
            case 8:
                System.out.println("So Tam");
                break;
            case 9:
                System.out.println("So Chin");
                break;
            default:
                System.out.println("So Khong Hop Le");
        }
    }
}
