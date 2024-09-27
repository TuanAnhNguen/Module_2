package case_study.view;

import case_study.controller.DeviceController;
import case_study.model.Device;
import case_study.model.Laptop;
import case_study.model.SmartPhone;

import java.util.List;
import java.util.Scanner;

public class DeviceManagement {
    private static final DeviceController deviceController = new DeviceController();
    private static final Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        do {
            System.out.println("--------Danh sách thiết bị-------- \n" +
                    "1. Laptop \n" +
                    "2. Smart Phone \n" +
                    "3. Thoát chương trình.");
            System.out.print("Nhập lựa chọn của bạn: ");
            int mainChoice = scanner.nextInt();
            switch (mainChoice) {
                case 1:
                    displayLaptopMenu();
                    break;
                case 2:
                    displaySmartPhoneMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không đúng, vui lòng chọn lại!!");
            }
        } while (true);
    }

    public void displayLaptopMenu() {
        do {
            System.out.println("--------Laptop------- \n" +
                    "1. Hiển thị danh sách Laptop \n" +
                    "2. Thêm mới \n" +
                    "3. Chỉnh sửa \n" +
                    "4. Xoá \n" +
                    "5. Quay lại danh sách thiết bị \n");
            System.out.print("Nhập lựa chọn của bạn: ");
            int laptopChoice = scanner.nextInt();
            scanner.nextLine();
            switch (laptopChoice) {
                case 1:
                    List<Device> laptops = deviceController.getLaptops();
                    for (Device laptop : laptops) {
                        System.out.println(laptop);
                    }
                    break;
                case 2:
                    addNewLaptop();
                    break;
                case 3:
                    updateLaptop();
                    break;
                case 4:
                    deleteLaptop();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không đúng, vui lòng chọn lại!!");
            }
        } while (true);
    }

    public void addNewLaptop() {
        String newLaptopCode;
        System.out.print("Nhập mã sản phẩm: ");
        newLaptopCode = scanner.nextLine();
        if (deviceController.isExistLaptop(newLaptopCode)){
            System.out.println("Mã Laptop đã có rồi!");
            return;
        }
        System.out.print("Nhập tên Laptop: ");
        String newLaptopName = scanner.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        String newLaptopManufacturer = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int newLaptopYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập dữ liệu CPU: ");
        String newLaptopCPU = scanner.nextLine();
        System.out.print("Nhập dữ liệu ổ cứng: ");
        String newLaptopHardDrive = scanner.nextLine();

        Laptop newLaptop = new Laptop(newLaptopCode, newLaptopName, newLaptopManufacturer, newLaptopYear, newLaptopCPU,newLaptopHardDrive);
        deviceController.addLaptop(newLaptop);
        System.out.println("Thêm mới thành công!");
    }

    public void updateLaptop() {
        System.out.print("Nhập mã Laptop chỉnh sửa: ");
        String updateLaptopCode = scanner.nextLine();
        Device updatedLaptop = (Laptop) deviceController.findLaptopByCode(updateLaptopCode);
        if (updatedLaptop != null) {
            System.out.print("Nhập tên Laptop: ");
            String updateLaptopName = scanner.nextLine();
            System.out.print("Nhập tên nhà sản xuất: ");
            String updateLaptopManufacturer = scanner.nextLine();
            System.out.print("Nhập năm sản xuất: ");
            int updateLaptopYear = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập dữ liệu CPU: ");
            String updateLaptopCPU = scanner.nextLine();
            System.out.print("Nhập dữ liệu ổ cứng: ");
            String updateLaptopHardDrive = scanner.nextLine();

            updatedLaptop.setCode(updateLaptopCode);
            updatedLaptop.setName(updateLaptopName);
            updatedLaptop.setManufacturer(updateLaptopManufacturer);
            updatedLaptop.setYearOfManufacture(updateLaptopYear);
            ((Laptop) updatedLaptop).setCpuName(updateLaptopCPU);
            ((Laptop) updatedLaptop).setHardDrive(updateLaptopHardDrive);

            deviceController.updateLaptop((Laptop) updatedLaptop);
            System.out.println("Chỉnh sửa thành công!");
        } else {
            System.out.println("Không tìm thấy Laptop!");
        }
    }

    public void deleteLaptop() {
        System.out.print("Nhập mã Laptop muốn xoá: ");
        String deleteLaptopCode = scanner.nextLine();
        if (deviceController.isExistLaptop(deleteLaptopCode)) {
            deviceController.deleteLaptop(deleteLaptopCode);
            System.out.println("Đã xoá Laptop!");
        } else {
            System.out.println("Không tìm thấy Laptop!");
        }
    }

    public void displaySmartPhoneMenu() {
        do {
            System.out.println("--------Smart Phone------- \n" +
                    "1. Hiển thị danh sách Smart Phone \n" +
                    "2. Thêm mới \n" +
                    "3. Chỉnh sửa \n" +
                    "4. Xoá \n" +
                    "5. Quay lại danh sách thiết bị \n");
            System.out.print("Nhập lựa chọn của bạn: ");
            int smartPhoneChoice = scanner.nextInt();
            scanner.nextLine();
            switch (smartPhoneChoice) {
                case 1:
                    List<Device> smartPhones = deviceController.getSmartPhones();
                    for (Device smartPhone : smartPhones) {
                        System.out.println(smartPhone);
                    }
                    break;
                case 2:
                    addNewSmartPhone();
                    break;
                case 3:
                    updateSmartPhone();
                    break;
                case 4:
                    deleteSmartPhone();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không đúng, vui lòng chọn lại!!");
            }
        } while (true);
    }
    public void addNewSmartPhone() {
        String newSmartPhoneCode;
        System.out.print("Nhập mã sản phẩm: ");
        newSmartPhoneCode = scanner.nextLine();
        if (deviceController.isExistSmartPhone(newSmartPhoneCode)){
            System.out.println("Mã điện thoại đã có rồi!");
            return;
        }
        System.out.print("Nhập tên điện thoại: ");
        String newSmartPhoneName = scanner.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        String newSmartPhoneManufacturer = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int newSmartPhoneYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập hệ điều hành: ");
        String newSmartPhoneOperatingSystem = scanner.nextLine();
        System.out.print("Nhập dung lượng pin: ");
        int newSmartPhoneCapacity = scanner.nextInt();

        SmartPhone newSmartPhone = new SmartPhone(newSmartPhoneCode, newSmartPhoneName, newSmartPhoneManufacturer, newSmartPhoneYear, newSmartPhoneOperatingSystem,newSmartPhoneCapacity);
        deviceController.addSmartPhone(newSmartPhone);
        System.out.println("Thêm mới thành công!");
    }
    public void updateSmartPhone() {
        System.out.print("Nhập mã sản phẩm chỉnh sửa: ");
        String updateSmartPhoneCode = scanner.nextLine();
        Device updatedSmartPhone = (SmartPhone) deviceController.findSmartPhoneByCode(updateSmartPhoneCode);
        if (updatedSmartPhone != null) {
            System.out.print("Nhập tên điện thoại: ");
            String updateSmartPhoneName = scanner.nextLine();
            System.out.print("Nhập tên nhà sản xuất: ");
            String updateSmartPhoneManufacturer = scanner.nextLine();
            System.out.print("Nhập năm sản xuất: ");
            int updateSmartPhoneYear = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập hệ điều hành: ");
            String updateSmartPhoneOperatingSystem = scanner.nextLine();
            System.out.print("Nhập dung lượng pin: ");
            int updateSmartPhoneCapacity = scanner.nextInt();

            updatedSmartPhone.setCode(updateSmartPhoneCode);
            updatedSmartPhone.setName(updateSmartPhoneName);
            updatedSmartPhone.setManufacturer(updateSmartPhoneManufacturer);
            updatedSmartPhone.setYearOfManufacture(updateSmartPhoneYear);
            ((SmartPhone) updatedSmartPhone).setOperatingSystem(updateSmartPhoneOperatingSystem);
            ((SmartPhone) updatedSmartPhone).setCapacity(updateSmartPhoneCapacity);

            deviceController.updateSmartPhone((SmartPhone) updatedSmartPhone);
            System.out.println("Chỉnh sửa thành công!");
        } else {
            System.out.println("Không tìm thấy sản phầm!");
        }
    }
    public void deleteSmartPhone() {
        System.out.print("Nhập mã sản phẩm muốn xoá: ");
        String deleteSmartPhoneCode = scanner.nextLine();
        if (deviceController.isExistSmartPhone(deleteSmartPhoneCode)) {
            deviceController.deleteSmartPhone(deleteSmartPhoneCode);
            System.out.println("Đã xoá sản phẩm!");
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    public static void main(String[] args) {
        DeviceManagement deviceManagement = new DeviceManagement();
        deviceManagement.displayMainMenu();
    }
}
