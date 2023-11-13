package baitap15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager management = new StudentManager();
        management.addStudent(new Student(1, "nguyen van A", 8.5));
        management.addStudent(new Student(2, "Nguyen Van B", 7.0));
        management.addStudent(new Student(3, "Nguyen Van C", 9.4));
        System.out.println("Danh sách sinh viên:");
        management.showAll();
        Student foundStudent = management.findStudentById(2);
        if (foundStudent != null) {
            System.out.println("Sinh viên đã tìm thấy: " + foundStudent.getName());
        }
        management.removeStudent(1);
        System.out.println("Danh sách sinh viên sau khi xóa:");
        management.showAll();
        System.out.println("Điểm trung bình của tất cả sinh viên: " + management.getAverageScore());

        management.sortByScore();
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        management.showAll();
    }
}
