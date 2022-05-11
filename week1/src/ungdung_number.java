import java.util.Scanner;

public class ungdung_number {
    static String resul1t(int number){
        String result = "";




        switch (number) {
            case 1:
                result = "one";
            case 2:
                result = "two";
            case 3:
                result = "three";
            case 4:
                result = "four";
            case 5:
                result = "five";
            case 6:
                result = "six";
            case 7:
                result = "seven";
            case 8:
                result = "eigth";
            case 9:
                result = "night";
            case 0:
                result = "zero";
        }


        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: " );

        int number = scanner.nextInt();

        System.out.println("Đọc là: " + resul1t(number) );


    }

}