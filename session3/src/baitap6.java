import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận: ");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
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
        int j;
        do {
            System.out.println("Hãy Nhập Cột Muốn Tính Tổng: ");
            j = sc.nextInt();
            if (j > 0 && j < col){
                int sum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][j];
                }
                System.out.println(sum);
            }
        } while (j > 0 && j < col);

    }
}
