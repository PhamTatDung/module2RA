package baitp4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Nhập vào thông tin tam giác!**********");
        System.out.println("Nhập cạnh thứ 1: ");
        triangle.setSide1(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập cạnh thứ 2: ");
        triangle.setSide2(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập cạnh thứ 3: ");
        triangle.setSide3(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập màu của tam giác: ");
        triangle.setColor(sc.nextLine());
       if (isTriagle(triangle.getSide1(), triangle.getSide2(), triangle.getSide3())){
           System.out.println("**********Thông tin tam giác!**********");
           System.out.println(triangle);
       }
       else {
           System.out.println("Thông Tin Bạn Nhập Không Hợp Lệ!");
       }
    }

    public static boolean isTriagle(double a, double b, double c) {
        boolean rule1 = a > 0 && b > 0 && c > 0;
        boolean rule2 = ((a + b) > c) && ((a + c) > b) && ((c + b) > a);
        if (rule1 && rule2) {
            return true;
        } else {
            return false;
        }

    }
}
