package ss7_Abstract_and_Interfaces.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);

        rectangle = new Rectangle(6, 7, "pink", true);
        System.out.println(rectangle);
    }
}
