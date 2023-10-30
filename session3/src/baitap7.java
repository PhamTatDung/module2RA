import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài hàng và cột: ");
        int len = sc.nextInt();
        int[][] matrix = new int[len][len];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Nhập Giá Trị Tọa Độ (%d; %d): ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng Vừa Nhâp Là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
           sum += matrix[i][i];
        }
        System.out.println("Tổng đường chéo chính: "+sum);
    }
}
