package ss1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class ConvertVnd {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 25000;
        System.out.println("Giá trị VND: " + quydoi + "đồng");
    }
}
