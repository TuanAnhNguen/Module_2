package case_study_manager.view;

import case_study_manager.controller.StudentController;
import case_study_manager.model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentManagement {
    private StudentController studentController = new StudentController();
    private Scanner scanner = new Scanner(System.in);

    private void displayMainMenu() {
        do {
            System.out.println("\nQuản lý sinh viên: \n" +
            "1. Hiển thị danh sách sinh viên. \n" +
            "2. Thêm mới sinh viên. \n" +
            "3. Chỉnh sửa danh sách sinh viên. \n" +
            "4. Xoá danh sách sinh viên. \n" +
            "5. Thoát. \n");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentController.getStudentList();
                    break;
                case 2:
                    createNewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không đúng, vui lòng chọn lại!!");
            }
        }
        while (true);
    }

    private void deleteStudent() {
        System.out.println("Nhập mã sinh viên cần xoá: ");
        String studentCode = scanner.nextLine();
        studentController.deleteStudent(studentCode);
        System.out.println("Sinh viên đã được xoá!!");
    }

    private void createNewStudent() {
        String studentCode;
        while (true) {
            System.out.println("Nhập mã sinh viên: ");
            studentCode = scanner.nextLine();
            if (studentController.isStudentCodeExist(studentCode)) {
                System.out.println("Mã sinh viên đã tồn tại!");
            } else {
                break;
            }
        }

        System.out.println("Nhập tên của sinh viên: ");
        String studentName = scanner.nextLine();
        System.out.println("Nhập ngày sinh của sinh viên: ");
        LocalDate studentOnBoardDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập email của sinh viên: ");
        String studentEmail = scanner.nextLine();
        System.out.println("Nhập lớp của sinh viên: ");
        String studentCourse = scanner.nextLine();

        Student newStudent = new Student(studentCode, studentName, studentOnBoardDate, studentEmail, studentCourse);
        studentController.addNewStudent(newStudent);
        System.out.println("Sinh viên đã được thêm mới");
    }

    private void updateStudent() {
        System.out.println("Nhập mã sinh viên cần chỉnh sửa: ");
        String studentCode = scanner.nextLine();
        Student student = studentController.getStudentByCode(studentCode);
        if (student != null) {
            System.out.println("Cập nhật thông tin sinh viên tại đây.");
            System.out.println("Nhập tên của sinh viên: ");
            String studentName = scanner.nextLine();
            System.out.println("Nhập ngày sinh của sinh viên: ");
            LocalDate studentOnBoardDate = LocalDate.parse(scanner.nextLine());
            System.out.println("Nhập email của sinh viên: ");
            String studentEmail = scanner.nextLine();
            System.out.println("Nhập lớp của sinh viên: ");
            String studentCourse = scanner.nextLine();

            studentController.updateStudent(student);
            System.out.println("Đã cập nhật thông tin sinh viên!!");
        } else {
            System.out.println("Không tìm thấy sinh viên");
        }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.displayMainMenu();
    }
}
