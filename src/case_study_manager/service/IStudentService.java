package case_study_manager.service;

import case_study_manager.model.Student;

public interface IStudentService {
    void addNewStudent(Student student);
    Student[] findAllStudents();
    Student findStudentByCode(String code);
    void updateStudent(Student student);
    void deleteStudent(String code);
}
