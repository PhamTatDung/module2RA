import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        int choose;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Menu: \n"+
                        "\t 1. Kiểm tra tính chẵn lẻ của 1 số.\n" +
                        "\t 2. Kiểm tra số nguyên tố.\n" +
                        "\t 3. Kiểm tra một số có chia hết cho 3 không.\n" +
                        "\t 4. Thoát \n");
        do {
            System.out.println("Nhap Lua Tron Tu Menu: ");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhap so muon kiem tra chan le: ");
                    n = sc.nextInt();
                    if (n%2==0){
                        System.out.println(n + " la so chan");
                    }
                    else {
                        System.out.println(n+ " la so le");
                    }
                    break;
                case 2:
                    System.out.println("Nhap so muon kiem tra: ");
                    n = sc.nextInt();
                    boolean isPrime = true;
                    if (n<2){
                        System.out.println(n + " khong phai la so nguyen to");
                    } else if (n == 2) {
                        System.out.println(n + " la so nguyen to");
                    }
                    else {
                        for (int i = 2; i < n; i++) {
                            if (n%i==0){
                                isPrime = false;
                            }
                        }
                        if (isPrime){
                            System.out.println(n+ " la so nguyen to");
                        }
                        else {
                            System.out.println(n+ " khong phai la so nguyen to");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhap so muon kiem tra: ");
                    n = sc.nextInt();
                    if (n%3==0){
                        System.out.println(n+ " chia het cho 3!");
                    }
                    else {
                        System.out.println(n+ " khong chia het cho 3!");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("warring: Hay Nhap Dung Lua Chon Cua menu");
            }

        }
        while (choose != 4);

    }
}
