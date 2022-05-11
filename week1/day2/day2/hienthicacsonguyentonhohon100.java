
public class hienthicacsonguyentonhohon100 {
    public static void main(String[] args) {


            int count = 1;
            int a = 2;
            while (a<100) {
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

