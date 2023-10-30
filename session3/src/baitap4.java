import java.util.Arrays;
import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận: ");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        int col = sc.nextInt();
        double[][] matrix = new double[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Nhập Giá Trị Tọa Độ (%d; %d): ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }
        double max = matrix[0][0];
        int x = 0;
        int y = 0;
        System.out.println("Ma Trận Sau Khi Nhập: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ "  ");
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
            System.out.println("");
        }
        System.out.println("Giá Trị Lớn Nhất Là: " + max);
        System.out.printf("Tạo Độ Của Phần Tử Lớn Nhất Là: (%d;%d)", x, y);
    }
}
