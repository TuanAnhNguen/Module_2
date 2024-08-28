package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MoveablePoint p1 = new MoveablePoint(1, 2, 3, 4);
        MoveablePoint p2 = new MoveablePoint(5, 6, 7, 8);

        List<MoveablePoint> list = new ArrayList<MoveablePoint>();
        list.add(p1);
        list.add(p2);

        for (MoveablePoint p : list) {
            System.out.println(p.toString());
            System.out.println(p.move());
        }
    }
}
