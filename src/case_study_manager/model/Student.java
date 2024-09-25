package case_study_manager.model;

import java.time.LocalDate;

public class Student extends Person{
    private String course;
    private String grade;

    public Student() {
    }

    public Student(String course, String grade) {
        this.course = course;
        this.grade = grade;
    }

    public Student(String code, String name, LocalDate onBoardDate, String email, String course, String grade) {
        super(code, name, onBoardDate, email);
        this.course = course;
        this.grade = grade;
    }

    public Student(String studentCode, String studentName, LocalDate studentOnBoardDate, String studentEmail, String studentCourse) {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", course: " + course + ", grade: " + grade + ".";
    }
}