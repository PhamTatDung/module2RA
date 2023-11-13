package baitap15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private static List<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }
    public void showAll(){
        for (Student student: studentList) {
            System.out.println("MSV: "+student.getStudentID()+
                    " | Tên: "+student.getName()+
                    " | Điểm Trung : "+student.getAverageScore());
        }
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(int studentId) {
        studentList.removeIf(student -> student.getStudentID() == studentId);
    }
    public Student findStudentById(int studentId) {
        for (Student student : studentList) {
            if (student.getStudentID() == studentId) {
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
        return null;
    }
    public double getAverageScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getAverageScore();
        }
        return totalScore / studentList.size();
    }
    public void sortByScore() {
        Collections.sort(studentList, (s1, s2) -> Double.compare(s1.getAverageScore(), s2.getAverageScore()));
    }
}
