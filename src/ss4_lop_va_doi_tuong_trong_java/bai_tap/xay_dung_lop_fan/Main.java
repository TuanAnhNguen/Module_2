package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(false);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(true);

        System.out.println("Fan1: " + fan1);
        System.out.println("Fan2: " + fan2);
    }
}
