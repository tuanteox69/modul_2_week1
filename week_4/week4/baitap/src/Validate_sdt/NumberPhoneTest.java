package Validate_sdt;

import Validate_ten_cua_lophoc.NameClass_Example;

import java.util.Scanner;

public class NumberPhoneTest {
    public static void main(String[] args) {
      NumberPhone numberPhone = new NumberPhone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sdt: ");
        String input = scanner.nextLine();
        if (numberPhone.validate(input)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
