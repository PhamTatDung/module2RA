package baitap15;

public class Student {
    private int studentID;
    private String name;
    private double averageScore;

    public Student() {
    }

    public Student(int studentID, String name, double averageScore) {
        this.studentID = studentID;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
