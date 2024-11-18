package ss1_introduction_to_java.bai_tap.doc_so_thanh_chu;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (0-999): ");
        int number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Number out of range");
        } else {
            System.out.println(convertNumberToWords(number));
        }
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        // StringBuilder là 1 lớp giúp xây dựng chuỗi
        StringBuilder words = new StringBuilder();

        // xử lý chữ số hàng trăm
        if (number >= 100) {
            int hundred = number / 100;

            // append() nối chuỗi mới vào chuỗi hiện có
            words.append(convertSingleDigit(hundred)).append(" Hundred");
            number %= 100;
            if (number > 0) {
                words.append(" and ");
            }
        }

        // xử lý chữ số nhỏ hơn 100
        if (number >= 20) {
            int tens = number / 10;
            words.append(convertTens(tens));
            number %= 10;
            if (number > 0) {
                words.append(" ").append(convertSingleDigit(number));
            }
        } else if (number >= 10) {
            words.append(convertTeen(number));
        } else if (number > 0) {
            words.append(convertSingleDigit(number));
        }
        return words.toString();
    }

    public static String convertSingleDigit(int number) {
        switch (number) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }

    public static String convertTeen(int number) {
        switch (number) {
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
            default: return "";
        }
    }

    public static String convertTens(int number) {
        switch (number) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return "";
        }
    }
}
