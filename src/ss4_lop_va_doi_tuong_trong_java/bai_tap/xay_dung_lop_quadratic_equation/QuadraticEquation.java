package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public void screen() {
        if (this.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("Phương trình có 2 nghiệm kép x1 = x2 = " + this.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + this.getRoot1() + "và x2 = " + this.getRoot2());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        quadraticEquation.screen();
    }
}
