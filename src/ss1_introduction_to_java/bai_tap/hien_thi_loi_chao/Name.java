package ss1_introduction_to_java.bai_tap.hien_thi_loi_chao;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        // Tạo đối tượng để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // Hiển thị yêu cầu nhập tên
        System.out.println("Enter your name: ");
        // Đọc tên người dùng từ bàn phím
        String name = scanner.nextLine();
        // Hiển thị lời chào
        System.out.println("Helle: " + name);
        scanner.close();
    }
}