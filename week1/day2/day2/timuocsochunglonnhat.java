import java.util.Scanner;

public class timuocsochunglonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (1 > 0) {
            System.out.print("số thứ nhất: ");
            int num1 = sc.nextInt();
            System.out.print("số thứ hai: ");
            int num2 = sc.nextInt();
            int minNum = num1;
            int maxUoc = 1;
            if (num1 > num2) {
                minNum = num2;
            }
            for (int i = 1; i <= minNum; i++) {
                if ((num1 % i == 0) && (num2 % i == 0)) {
                    maxUoc = i;
                }
            }
            System.out.println("ước chung lớn nhất là: " + maxUoc);
        }
    }
}
