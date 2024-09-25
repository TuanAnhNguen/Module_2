package case_study_manager.repository;

import case_study_manager.model.Student;

public interface IStudentRepository {
    void addNewStudent(Student student);
    Student[] findAllStudents();
    Student findStudentByCode(String code);
    void updateStudent(Student student);
    void deleteStudent(String student);
}
