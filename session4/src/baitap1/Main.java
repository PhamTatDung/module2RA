package baitap1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("Dien tich: "+circle.dienTich());
        System.out.println("Chu Vi: "+circle.chuVi());

    }
}
