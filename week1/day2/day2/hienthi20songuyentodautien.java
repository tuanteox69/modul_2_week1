import java.util.Scanner;
public class hienthi20songuyentodautien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lưu số lượng số nguyên tố cần in ra:(VD:20)");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Nhập lại: ");
        } else {
            int count = 1;
            int a = 2;
            while (count <= number) {
                boolean check = true;
                for (int i = 2; i <= a / 2; i++) {
                    if (a % i == 0 && 2 != a) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(count +".  "+ a);
                    count++;
                }
                a++;
            }
        }
    }
}
