package case_study_manager.repository;

import case_study_manager.model.Student;

public class StudentRepository implements IStudentRepository {
    @Override
    public void addNewStudent(Student student) {

    }

    @Override
    public Student[] findAllStudents() {
        return new Student[0];
    }

    @Override
    public Student findStudentByCode(String code) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(String student) {

    }
}
