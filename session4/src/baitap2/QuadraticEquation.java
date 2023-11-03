package baitap2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1(){
        double delta = getDiscriminant();
        double r1 = 0;
        if (delta>=0){
            r1 = (-b + Math.sqrt(delta))/(2*a);
        }
        return r1;
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        double r2 = 0;
        if (delta>=0){
            r2 = (-b - Math.sqrt(delta))/(2*a);
        }
        return r2;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        this.a = Double.parseDouble(sc.nextLine());
        System.out.println("nhap b: ");
        this.b = Double.parseDouble(sc.nextLine());
        System.out.println("nhap c: ");
        this.c = Double.parseDouble(sc.nextLine());
    }

    public void displayData() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
