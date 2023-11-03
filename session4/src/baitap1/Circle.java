package baitap1;

import java.util.Scanner;

public class Circle {
    private double r;
    private  String color;

    public Circle() {
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double chuVi(){
        return 2*Math.PI*r;
    }
    public double dienTich(){
        return Math.PI*r*r;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh: ");
        this.r = Double.parseDouble(sc.nextLine());
        System.out.println("nhap mau: ");
        this.color = sc.nextLine();
    }
    public void displayData(){
        System.out.println("thong tin hinh tron: ");;
        System.out.println("ban kinh: "+r+"| mau sac: "+color);
    }
}
