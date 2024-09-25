package case_study_manager.service;

import case_study_manager.model.Student;
import case_study_manager.repository.IStudentRepository;
import case_study_manager.repository.StudentRepository;

public class StudentService implements IStudentService {

    private final IStudentRepository iStudentRepository = new StudentRepository();
    @Override
    public void addNewStudent(Student student) {
        iStudentRepository.addNewStudent(student);
    }

    @Override
    public Student[] findAllStudents() {
        return iStudentRepository.findAllStudents();
    }

    @Override
    public Student findStudentByCode(String code) {
        return iStudentRepository.findStudentByCode(code);
    }

    @Override
    public void updateStudent(Student student) {
        iStudentRepository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String code) {
        iStudentRepository.deleteStudent(code);
    }
}
