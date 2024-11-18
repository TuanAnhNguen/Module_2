package case_study_manager.view;

import case_study_manager.controller.StudentController;
import case_study_manager.model.Student;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------Quản lý CodeGym---------");
            System.out.println("1. Quản lý Sinh Viên");
            System.out.println("2. Quản lý Giảng Viên");
            System.out.println("3. Thoát");
            System.out.println("Mời bạn nhập lựa chọn: ");
            int choice = inputChoice();
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    System.out.println("Quản lý Giảng Viên");
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void menuStudent() {
        StudentController studentController = new StudentController();
        int choice;
        List<Student> students;
        Student student;
        while (true) {
            System.out.println("--------Menu quản lý Sinh Viên--------");
            System.out.println("1. Hiển thị danh sách Sinh Viên");
            System.out.println("2. Thêm mới Sinh Viên");
            System.out.println("3. Sửa thông tin Sinh Viên");
            System.out.println("4. Xóa thông tin Sinh Viên");
            System.out.println("5. Tìm kiếm Sinh Viên theo tên");
            System.out.println("6. Quay lại");
            System.out.println("Mời bạn nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            choice = inputChoice();
            switch (choice) {
                case 1:
                    students = studentController.getAll();
                    display(students);
                    break;
                case 2:
                    student = inputStudent();
                    studentController.save(student);
                    System.out.println("Thêm mới thành công!");
                    break;
                case 3:
                    System.out.println("Sửa thông tin Sinh Viên");
                    break;
                case 4:
                    System.out.print("Nhập id cần xóa: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    boolean isFind = studentController.isExistsStudent(id);
                    if (!isFind) {
                        System.out.println("Không tìm thấy Sinh viên có id là " + id);
                    } else {
                        System.out.println("Bạn có chắc muốn xóa hay không. Nhấn Y nếu đồng ý hoặc bất kỳ ký tự khác nếu không?");
                        String isConfirm = scanner.nextLine();
                        if (isConfirm.equalsIgnoreCase("y")) {
                            studentController.deleteById(id);
                            System.out.println("Xóa Sinh viên thành công!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Tìm kiếm Sinh Viên theo tên");
                    String name = scanner.nextLine();
                    students = studentController.searchByName(name);
                    display(students);
                    break;
                case 6:
                    return;
            }
        }
    }

    private static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập code: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();

        while (!name.matches("^[A-Z][a-z]{5,100}$")) {
            System.out.println("Bạn nhập sai định dạng tên");
            System.out.print("Mời bạn nhập lại: ");
            name = scanner.nextLine();
        }
        System.out.println("Mời bạn nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm: ");
        double points = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập lớp: ");
        String className = scanner.nextLine();
        return new Student(code, name, address, points, className);
    }

    private static void display(List<Student> students) {
        System.out.println("Hiển thị danh sách Sinh Viên");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai lựa chọn. Mời bạn nhập lại: ");
        } catch (Exception e) {
            System.out.println("Lỗi khác!");
        }
        return 0;
    }
}
