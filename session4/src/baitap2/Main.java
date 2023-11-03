package baitap2;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.inputData();
        quadraticEquation.displayData();
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0){
            System.out.println("nghiem 1: "+quadraticEquation.getRoot1());
            System.out.println("nghiem 2: "+quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("2 nghiem bang nhau: "+quadraticEquation.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
