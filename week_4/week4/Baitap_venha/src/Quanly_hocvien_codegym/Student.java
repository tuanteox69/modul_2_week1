package Quanly_hocvien_codegym;

import java.util.Date;

public class Student extends Lop {
    private String name;
    private int age;
    private Date birthday;
    private String address;

    public Student() {
    }



    public Student(String classname, int date, int khoa, int slhv, String name, int age, Date birthday, String address) {
        super(classname, date, khoa, slhv);
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}'+super.toString();
    }
}