package ss7_Abstract_and_Interfaces.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("green", false);
        System.out.println(shape);
    }
}
