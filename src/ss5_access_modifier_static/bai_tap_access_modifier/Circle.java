package ss5_access_modifier_static.bai_tap_access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
