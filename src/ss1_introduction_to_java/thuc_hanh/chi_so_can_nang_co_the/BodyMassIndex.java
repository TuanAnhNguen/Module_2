package ss1_introduction_to_java.thuc_hanh.chi_so_can_nang_co_the;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter the weight in kilogram: ");
        weight = sc.nextDouble();
        System.out.println("Enter the height in meters: ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("BMI is " + bmi);
        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi >= 18 && bmi < 25) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
