package ss3_mang.bai_tap.gop_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Nhập độ dài mảng 2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for(int i = 0; i < size1; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 1: ");
            array1[i] = sc.nextInt();
        }
        for(int i = 0; i < size2; i++) {
            System.out.println("Nhập phần tử chứ " + (i + 1) + " của mảng 2: ");
            array2[i] = sc.nextInt();
        }
        System.out.println("Mảng 1 là: " + Arrays.toString(array1));
        System.out.println("Mảng 2 là: " + Arrays.toString(array2));
        int[] array3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        System.out.println("Mảng 3 là: " + Arrays.toString(array3));
    }
}
