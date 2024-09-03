package ss7_Abstract_and_Interfaces.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        circle = new Circle(5, "blue", false);
        System.out.println(circle);
    }
}
