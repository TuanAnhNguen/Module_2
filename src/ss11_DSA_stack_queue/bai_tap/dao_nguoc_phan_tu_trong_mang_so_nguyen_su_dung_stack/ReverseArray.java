package ss11_DSA_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        // tạo 1 stack kiểu Integer
        Stack<Integer> stack = new Stack<Integer>();

        // đẩy các phần tử của mảng vào trong stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        // lấy lần lượt các phần tử từ stack ra và gán lại vào mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
