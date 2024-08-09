package ss1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class ConvertUsd {
    public static void main(String[] args) {
        double vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số tiền VND: ");
        vnd = sc.nextDouble();
        double quydoi = vnd / 25000;
        System.out.println("Giá trị USD: " + quydoi + "$");
    }
}
