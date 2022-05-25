package shape.compareAbleShape;

import java.lang.Comparable;

import shape.Rectangle;

public class CompareAbleRectangle extends Rectangle
        implements Comparable<CompareAbleRectangle> {
    public CompareAbleRectangle() {
    }

    public CompareAbleRectangle(double width, double length) {
        super(width, length);
    }

    public CompareAbleRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public int compareTo(CompareAbleRectangle o) {
        if (getArea() > o.getArea()) return 1;
        else if (getArea() < o.getArea()) return -1;
        return 0;
    }
}