package ss7_Abstract_and_Interfaces.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input random percentage between 0 and 100: ");
        double percent = sc.nextInt();
        if (percent <= 100 && percent >= 1) {
            Circle circle = new Circle(3);
            Circle circle2 = new Circle(5);
            Rectangle rectangle = new Rectangle(5, 6);
            Rectangle rectangle2 = new Rectangle(6, 7);
            List<Circle> circles = new ArrayList<>();
            circles.add(circle);
            circles.add(circle2);
            List<Rectangle> rectangles = new ArrayList<>();
            rectangles.add(rectangle);
            rectangles.add(rectangle2);

            for (Circle c : circles) {
                System.out.println("Circle's Area: " + c.getArea());
                c.resize(percent);
            }

            for (Rectangle r : rectangles) {
                System.out.println("Rectangle's Area: " + r.getArea());
                r.resize(percent);
            }
        } else {
            System.out.println("Invalid percentage");
        }
    }
}
