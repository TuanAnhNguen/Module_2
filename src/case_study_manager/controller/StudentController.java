package case_study_manager.controller;

import case_study_manager.model.Student;
import case_study_manager.service.IStudentService;
import case_study_manager.service.StudentService;

public class StudentController {
    private final IStudentService istudentService = new StudentService();

    public void getStudentList() {
        Student[] students = istudentService.findAllStudents();
        for (Student s : students) {
            if (s == null) {
                return;
            }
            System.out.println(s);
        }
    }

    public void addNewStudent(Student student) {
        istudentService.addNewStudent(student);
    }

    public Student getStudentByCode(String code) {
        return istudentService.findStudentByCode(code);
    }

    public void deleteStudent(String code) {
        istudentService.deleteStudent(code);
    }

    public boolean isStudentCodeExist(String code) {
        return istudentService.findStudentByCode(code) != null;
    }

    public void updateStudent(Student student) {
        istudentService.updateStudent(student);
    }
}
