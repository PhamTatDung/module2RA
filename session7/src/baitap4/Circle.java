package baitap4;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void display() {
        System.out.println("Hình chữ nhật: ");
        super.display();
        System.out.println("bán kính :"+ radius);
    }
}
