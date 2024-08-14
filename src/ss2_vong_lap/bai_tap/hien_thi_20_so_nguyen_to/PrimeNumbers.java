package ss2_vong_lap.bai_tap.hien_thi_20_so_nguyen_to;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int numbers = sc.nextInt();                                 // nhập số lượng số nguyên tố từ người dùng
        int count = 0;                                              // biến đếm số lượng số nguyên tố đã in ra
        int N = 2;                                                  // bắt đầu kiểm tra từ số 2
        System.out.println("Số nguyên tố là: ");
        while (count <= numbers) {                                  // đk count < numbers thì tiếp tục kiểm tra
            if (isPrime(N)) {                                       // kiểm tra N có phải số nguyên tố không
                if (count == numbers) {
                    System.out.print(N);
                } else {
                    System.out.print(N + ", ");
                }
                count++;
            }
            N++;
        }
    }
    // hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
