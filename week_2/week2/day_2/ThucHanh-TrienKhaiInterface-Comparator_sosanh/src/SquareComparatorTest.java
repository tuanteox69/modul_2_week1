import shape.Square;
import comporator.SquareComparator;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] Squares = new Square[3];
        Squares[0] = new Square(3.6);
        Squares[1] = new Square();
        Squares[2] = new Square(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Square square : Squares) {
            System.out.println(square);
        }

        Comparator SquareComparator = new SquareComparator();
        Arrays.sort(Squares, SquareComparator);

        System.out.println("After-sorted:");
        for (Square square : Squares) {
            System.out.println(square);
        }
    }
}