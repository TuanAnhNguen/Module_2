package ss6_ke_thua.bai_tap.lop_circle_va_cylinder;

import java.util.ArrayList;
import java.util.List;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4, "Red", 5);
        Cylinder cylinder1 = new Cylinder(6, "Green", 7);
        Cylinder cylinder2 = new Cylinder(3, "Blue", 4);

        List<Cylinder> list = new ArrayList<Cylinder>();
        list.add(cylinder);
        list.add(cylinder1);
        list.add(cylinder2);

        for (Cylinder c : list) {
            System.out.println(c.toString());
            System.out.println("Volume: " + c.getVolume());
        }
    }
}
