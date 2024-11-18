package case_study_manager.model;

public class Student extends Person implements Comparable<Student> {
    private double point;
    private String className;

    public Student() {
    }

    public Student(double point, String className) {
        this.point = point;
        this.className = className;
    }

    public Student(long code, String name, String address, double point, String className) {
        super(code, name, address);
        this.point = point;
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "point=" + point +
                ", className='" + className + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        if (this.getCode() > o.getCode()) {
            return 1;
        } else if (this.getCode() == o.getCode()) {
            return this.getName().compareTo(o.getName());
        }
        return -1;
    }
}
