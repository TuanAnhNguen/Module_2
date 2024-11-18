package ss1_introduction_to_java.thuc_hanh.phuong_trinh_bac_nhat;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Given a equation as 'ax + b = c', please enter constants: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Equantion pass with x = %f!\n" + answer);
        } else if (b == c) {
            System.out.println("The solution is all x!");
        } else {
            System.out.println("No solution!");
        }
    }
}
