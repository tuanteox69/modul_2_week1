package shape.compareAbleShape;

import java.lang.Comparable;

import shape.Circle;

public class CompareAbleCircle extends Circle
        implements Comparable<CompareAbleCircle> {

    public CompareAbleCircle() {
    }

    public CompareAbleCircle(double radius) {
        super(radius);
    }

    public CompareAbleCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(CompareAbleCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        return 0;
    }
}