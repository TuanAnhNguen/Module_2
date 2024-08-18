package ss3_mang.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vùa nhập là: " + Arrays.toString(arr));
        System.out.println("Nhập phần tử cần xoá trong mảng: ");
        int x = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < N - 1; i++) {
                arr[i] = arr[i+1];
            }
            N--;
            System.out.println("Mảng sau khi xoá phần tử: ");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
