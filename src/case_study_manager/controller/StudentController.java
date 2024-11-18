package case_study_manager.controller;

import case_study_manager.model.Student;
import case_study_manager.service.IStudentService;
import case_study_manager.service.StudentService;

import java.util.List;

public class StudentController {
    private static IStudentService studentService = new StudentService();

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public void save(Student student) {
        studentService.save(student);
    }

    public List<Student> searchByName(String name) {
        return studentService.findByName(name);
    }

    public boolean isExistsStudent(int id) {
        if (studentService.findById(id) != null) {
            return true;
        }
        return false;
    }

    public void deleteById(int id) {
        studentService.remove(id);
    }
}
