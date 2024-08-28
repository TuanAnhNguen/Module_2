package ss6_ke_thua.bai_tap.lop_point2d_va_point3d;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point3D point = new Point3D(3,4,5);
        Point3D point1 = new Point3D(2,4,6);
        Point3D point2 = new Point3D(3,5, 7);

        List<Point3D> points = new ArrayList<Point3D>();
        points.add(point);
        points.add(point1);
        points.add(point2);

        for (Point3D p : points) {
            System.out.println(p.toString());
        }
    }
}
