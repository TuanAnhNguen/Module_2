package examination_module_2.view;

import examination_module_2.controller.PhoneController;

import java.util.Scanner;

public class PhoneManagement {
    private final PhoneController phoneController = new PhoneController();
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("Chương trình quản lý điện thoại \n" +
                    "Chọn chức năng theo số (để tiếp tục)" +
                    "1. Thêm mới \n" +
                    "2. Xoá \n" +
                    "3. Xem danh sách điện thoại \n" +
                    "4. Tìm kiếm \n" +
                    "5. Thoát \n");
            System.out.println("Chọn chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addPhoneMenu();
                    break;
                case 2:
                    deletePhoneMenu();
                    break;
                case 3:
                    displayMenu();
                    break;
                case 4:
                    searchMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn chưa đúng, yêu cầu chọn lại: ");
            }
        } while (true);
    }

    public void addPhoneMenu() {
        System.out.println("");
    }

    public void deletePhoneMenu() {

    }

    public void displayMenu() {

    }

    public void searchMenu() {

    }

    public static void main(String[] args) {
        PhoneManagement phoneManagement = new PhoneManagement();
        phoneManagement.displayMainMenu();
    }
}
