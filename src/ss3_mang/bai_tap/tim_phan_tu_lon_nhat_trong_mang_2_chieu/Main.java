package ss3_mang.bai_tap.tim_phan_tu_lon_nhat_trong_mang_2_chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài hàng của mảng: ");
        int rows = sc.nextInt();
        System.out.println("Nhập độ dài cột của mảng: ");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Nhập phần tử ở cột: " + (i + 1) + " và hàng " + (j + 1) + " : ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int maxValue = array[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println("Phần tử có giá trị lớn nhất là: " + maxValue + " ở vị trí: [" + maxRow + ", " + maxColumn + "]");
    }
}
