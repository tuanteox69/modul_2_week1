import shape.Circle;
import shape.compareAbleShape.*;
public class Test {
    public static void main(String[] args) {
        CompareAbleCircle circle = new CompareAbleCircle(10);
        System.out.println(circle.toString());
        CompareAbleCircle circle2 =new CompareAbleCircle(20);
        System.out.println(circle2.toString());
        readCompare(circle.compareTo(circle2));



    }
    static void readCompare(int result){
        switch (result){
            case 1:
                System.out.println("Lớn hơn");
                break;
            case -1:
                System.out.println("Nhỏ hơn");
                break;
            case 0:
                System.out.println("bằng nhau");
        }
    }
}