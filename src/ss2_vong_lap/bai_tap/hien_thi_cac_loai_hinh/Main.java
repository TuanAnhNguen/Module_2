package ss2_vong_lap.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // tạo đối tượng Scanner để đọc dữ liệu đầu vào từ bàn phím
        int choice;                                  // khai báo biến kiểu nguyên để lưu trữ lữa chọn của ng dùng
        do {
            System.out.println("Menu");
            System.out.println("1. Print the Rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");  // Yêu cầu ng dùng nhập lựa chọn
            choice = scanner.nextInt();               // đọc lựa chọn của ng dùng và lưu vào biến choice
            switch (choice) {
                case 1:                               // nếu giá trị choice là 1, gọi phương thức printRectangle() để in HCN và sau đó thoát câu lệnh switch
                    printRectangle();
                    break;
                case 2:                               // nếu giá trị choice là 2, gọi phương thức printSquareTriangle() để in HCN và sau đó thoát câu lệnh switch
                    printSquareTriangle();
                    break;
                case 3:                               // nếu giá trị choice là 3, gọi phương thức printIsoscelesTriangle() để in HCN và sau đó thoát câu lệnh switch
                    printIsoscelesTriangle();
                    break;
                case 4:                               // nếu giá trị choice là 4, in ra thông báo Exiting và thoát khỏi câu lệnh switch
                    System.out.println("Exiting");
                    break;
                default:                              // nếu giá trị choice không khớp với trường hợp nào, in ra thông báo "Invalid choice. Please choice again!"
                    System.out.println("Invalid choice. Please choice again!");
            }
        } while (choice != 4);                        // tiếp tục vòng lặp do-while nếu choice không phải là 4
    }

    public static void printRectangle() {
        Scanner scanner = new Scanner(System.in);     // tạo 1 đối tượng scanner để đọc dữ liệu đầu vào từ bàn phím
        System.out.println("Enter the width of the rectangle: "); // yêu cầu nhập chều rộng của HCN
        int width = scanner.nextInt();                            // đọc chiều rộng từ ng dùng và lưu vào biến width
        System.out.println("Enter the height of the rectangle: ");// yêu cầu nhập chều dài của HCN
        int height = scanner.nextInt();                           // đọc chiều dài từ ng dùng và lưu vào biến height
        for (int i = 0; i < height; i++) {                        // vòng lặp qua từng hàng của HCN
            for (int j = 0; j < width; j++) {                     // vòng lặp qua từng cột trong hàng hiện tại
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the triangle: ");  // yêu cầu nhập kích thước của tam giác vuông
        int size = scanner.nextInt();

        System.out.println("Top-left: ");                       // in tiêu đề cho tam giác vuông góc bên trái
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Top-right: ");                      // in tiêu đề cho tam giác vuông góc bên phải
        for (int i = 1; i <= size; i++) {                       // vòng lặp để lặp qua từng hàng của tam giác
            for (int j = size - 1; j > 0; j--) {                // vòng lặp đ in khoảng trắng trước các ký tự *
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {                       // vòng lặp để in ký tự * sau khoảng trắng
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Bottom-left: ");                    // in tiêu đề cho tam giác vuông góc dưới bên trái
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Bottom-right: ");                    // in tiêu đề cho tam giác vuông góc dưới bên phải
        for (int i = size; i > 0; i--) {
            for (int j = size -i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the isosceles triangle: "); // yêu cầu nhập chiều cao tam giác cân
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {                                 // vòng lặp để lặp qua từng hàng của tam giác
            for (int j = height - i; j > 0; j--) {                          // vòng lặp in khoảng trắng trước các ký tự *
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {                         // vòng lặp để in ký tự * cho từng hàng, số lượng ký tự ở mỗi hàng là (2*i - 1)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
