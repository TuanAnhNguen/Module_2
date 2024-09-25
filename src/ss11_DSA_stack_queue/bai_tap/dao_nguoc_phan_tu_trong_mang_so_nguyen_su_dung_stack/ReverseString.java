package ss11_DSA_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc def ghi jkl ";

        // gọi phương thức để đảo ngược chuỗi
        String reverseString = reverseString(str);

        System.out.println(" Chuỗi đảo ngược là: ");
        System.out.println(reverseString);
    }

    public static String reverseString(String str) {
        // tách chuỗi thành các từ
        String[] words = str.split(" ");

        // tạo stack để chứa các từ
        Stack<String> stack = new Stack<>();

        // đẩy từ vào stack
        for (String word : words) {
            stack.push(word);
        }

        // tạo chuỗi mới để lưu các từ đảo ngược
        StringBuilder reversed = new StringBuilder();

        // lấy lần lượt các từ từ stack và nối chúng vào chuỗi mới
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
