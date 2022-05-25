package baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Tạo phòng mới");
        System.out.println("2. Tạo khách hàng mới:");
        System.out.println("3. Hiển thị các phòng => Săp xếp phòng theo giá");
        System.out.println("4. Hiển thị khách hàng.=> 1. Săp xếp khách theo id/ 2. Sắp xếp theo năm sinh.");
        System.out.println("5. Tìm kiếm khách hàng theo tên.");
        System.out.println("Nhập số: ");
        Scanner scanner = new Scanner(System.in);
      int choice;
      choice = scanner.nextInt();

        switch (choice){
            case 1: newphong();
            case 2: nhapThongTinKhachTro();
            case 3: 
        }
     }


    public static void nhapThongTinKhachTro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên khách hàng: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        String queQuan = scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân: ");
        String soCMND = scanner.nextLine();
    }
    private static void newphong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại phòng trọ: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập giá phòng: ");
        String queQuan = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String soCMND = scanner.nextLine();
    }
}