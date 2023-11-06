package employee;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gender;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, boolean gender, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ID nhân viên: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập vào tuổi nhân viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào hệ số lương nhân viên: ");
        double rate = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gender=" + (gender?"Nam":"Nữ") +
                ", rate=" + rate +
                ", salary=" + salary +
                '}';
    }

    public void displayData() {
        System.out.println(this);

    }

    public double calSalary() {
        return rate * 1300000;
    }
}

