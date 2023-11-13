package baitap4;

public class Main {
    public static void main(String[] args) {
        Shape rectangleTest = new Rectangle("Red", 3.0, 5.0);
        Shape circleTest = new Circle("Black", 5.0);
        System.out.println("********* Thông Tin Hình Chữ Nhật **********");
        rectangleTest.display();
        System.out.println("Diện Tích HCN: "+circleTest.getArea());
        System.out.println("********* Thông Tin Hình Tròn **********");
        circleTest.display();
        System.out.println("Diện Tích Hình Tròn: "+circleTest.getArea());
    }
}
