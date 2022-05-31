package Quanly_hocvien_codegym;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QLHV {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student>arrayList = new ArrayList<>();
    public void menu(){
        System.out.println("Menu");
        System.out.println("1.Nhập tên học viên");
        System.out.println("2.Hiển thị tất cả học viên");
        System.out.println("3.Hiển thị học viên theo lớp");

        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:creat();
                break;
            case 2:show();
                break;

            case 3:
        }

    }
    public void creat(){
        while (true) {
            try {
                System.out.println("Nhập tên học viên:");
                String name = sc.nextLine();
                System.out.println("Nhập tuổi học viên:");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập ngày sinh:");
                int ngaysinh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập tháng sinh:");
                int thangsinh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập năm sinh:");
                int namsinh = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập địa chỉ:");
                String address = sc.nextLine();
                System.out.println("Nhập tên lớp:");
                String classname = sc.nextLine();
                System.out.println("Nhập ngày bắt đầu học :");
                int date = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập khóa học");
                int khoahoc = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập số lương học viên :");
                int slhv = Integer.parseInt(sc.nextLine());
                Student student = new Student( classname,  date, khoahoc,  slhv, name,  age,new Date(namsinh -1900,thangsinh-1,ngaysinh) ,  address);
                arrayList.add(student);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai rồi, nhập lại đi");;
            }

        }

    }
    public void show(){
        for (Student a :arrayList
        ) {
            System.out.println(a);

        }
    }


}