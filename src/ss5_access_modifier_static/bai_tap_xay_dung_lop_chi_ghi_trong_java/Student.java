package ss5_access_modifier_static.bai_tap_xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "Tuấn Anh";
    private String classs = "CO5";
    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getClasss() {
        return classs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}
