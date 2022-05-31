package Quanly_hocvien_codegym;

public class Lop {
    private String classname;
    private int date;
    private int khoa;
    private int slhv;

    public Lop() {
    }

    public Lop(String classname, int date, int khoa, int slhv) {
        this.classname = classname;
        this.date = date;
        this.khoa = khoa;
        this.slhv = slhv;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public int getSlhv() {
        return slhv;
    }

    public void setSlhv(int slhv) {
        this.slhv = slhv;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "classname='" + classname + '\'' +
                ", date=" + date +
                ", khoa=" + khoa +
                ", slhv=" + slhv +
                '}';
    }
}