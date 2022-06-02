package Validate_ten_cua_lophoc;

import java.util.Scanner;

public class NameClass_Example_test {
        private static NameClass_Example nameClassExample;
        public static final String[] validnameExample = new String[] {};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten lop: ");

        nameClassExample = new NameClass_Example();
        for (String a: validnameExample
        ) {
            boolean isvalid = nameClassExample.validate(a);
            System.out.println("Class is " + a + "validate "+isvalid);
        }
        for (String a: validnameExample
        ) {
            boolean isvalid = nameClassExample.validate(a);
            System.out.println("Class is " + a + "validate "+isvalid);
        }
    }
}
