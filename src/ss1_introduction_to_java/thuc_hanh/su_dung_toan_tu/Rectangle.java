package ss1_introduction_to_java.thuc_hanh.su_dung_toan_tu;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width,height;
        Scanner sc = new Scanner(System.in);        //Khai bao doi tuong Scanner
        System.out.print("Enter width: ");
        width = sc.nextFloat();                     //Nhap chieu rong
        System.out.print("Enter height: ");
        height = sc.nextFloat();                    //Nhap chieu cao

        float area = width * height;
        System.out.println("Area is " + area);
    }
}
