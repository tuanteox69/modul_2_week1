import java.util.Arrays;
import shape.compareAbleShape.CompareAbleCircle;

class Tester {


    public static void main(String[] args) {
        CompareAbleCircle[] circles = new CompareAbleCircle[3];
        circles[0] = new CompareAbleCircle(3.6);
        circles[1] = new CompareAbleCircle();
        circles[2] = new CompareAbleCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (CompareAbleCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (CompareAbleCircle circle : circles) {
            System.out.println(circle);
        }
    }
}