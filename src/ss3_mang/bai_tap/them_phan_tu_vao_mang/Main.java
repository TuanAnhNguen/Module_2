package ss3_mang.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập phần tử X: ");
        int X = sc.nextInt();
        System.out.println("Nhập vị trí thêm phần tử: ");
        int index = sc.nextInt();
        if (index < 0 || index > N) {
            System.out.println("Vị trí nằm ngoài mảng");
        } else {
            for (int i = N; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X;
            N++;
            System.out.println("Mảng sau khi thêm phần tử là: ");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
