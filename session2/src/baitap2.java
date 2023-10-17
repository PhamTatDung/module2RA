import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. In hình chữ nhật (Rectangle)");
        System.out.println("2. In hình tam giác vuông góc vuông ở 4 góc khác nhau:");
        System.out.println("\t 1. Trên cùng bên phải( top-right)");
        System.out.println("\t 2. Trên cùng bên trái (top-left)");
        System.out.println("\t 3. Dưới cùng bên trái( bottom-left)");
        System.out.println("\t 4. Dưới cùng bên phải(bottom-right)");
        System.out.println("3. In hình tam giác cân ( Isosceles triangle):");
        System.out.println("4. Exit");
        int choose;
        do {
            System.out.println("Moi chon:");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Moi chon 2: ");
                    int chooseSub = sc.nextInt();
                    switch (chooseSub) {
                        case 1:
                            for (int i = 0; i <= 5; i++) {
                                for (int j = 0; j <= 5; j++) {
                                    if (j >= i) {
                                        System.out.print(" * ");
                                    } else {
                                        System.out.print("   ");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 5; i >= 0; i--) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 0; i <= 5; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("tam giac 4");
                            for (int i = 5; i >= 0; i--) {
                                for (int j = 0; j <= 5; j++) {
                                    if (j >= i) {
                                        System.out.print(" * ");
                                    } else {
                                        System.out.print("   ");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Warring: Hay Nhap Lua Chon Dung!");
                            break;

                    }
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            if ((j<=3+i)&&(j>=3-i)){
                                System.out.print(" * ");
                            }
                            else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Warring: Hay Nhap Lua Chon Dung!");
                    break;
            }

        } while (choose != 4);
    }
}
