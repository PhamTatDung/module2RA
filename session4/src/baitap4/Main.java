package baitap4;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.fast, true, 10, "yellow");
        System.out.println("Fan 1: "+fan1.toString());
        Fan fan2 = new Fan(Fan.medium, false, 5, "blue");
        System.out.println("Fan 1: "+fan2.toString());
    }


}
