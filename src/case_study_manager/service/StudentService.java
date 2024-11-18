package case_study_manager.service;

import case_study_manager.model.Student;
import case_study_manager.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private static StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();
        return students;
    }

    @Override
    public void save(Student s) {
        studentRepository.save(s);
    }

    @Override
    public void update(int id, Student s) {

    }

    @Override
    public void remove(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(int id) {
        List<Student> students = studentRepository.getAll();
        for (Student student : students) {
            if (student.getCode() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> students = studentRepository.getAll();
        List<Student> temp = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().contains(name)) {
                temp.add(s);
            }
        }
        return temp;
    }
}
