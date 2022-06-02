package Validate_ten_cua_lophoc;

import java.util.Scanner;

public class NameClass_Example_test {
    public static void main(String[] args) {
        NameClass_Example nameClassExample = new NameClass_Example();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten lop: ");
           String input = scanner.nextLine();
           if (nameClassExample.validate(input)){
               System.out.println("true");
        }else {
               System.out.println("false");
           }
    }
}
