package ss5_access_modifier_static.bai_tap_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,"blue");
        System.out.println("Bán kính hình tròn là: " + circle1.getRadius());
        System.out.println("Màu sắc hình tròn là: " + circle1.getColor());
        System.out.println("Diện tích hình tròn là: " + circle1.getArea());
    }
}
