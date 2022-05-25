package shape.compareAbleShape;

import shape.Square;

public class CompareAbleSquare extends Square
        implements Comparable<CompareAbleSquare> {
    public CompareAbleSquare() {
    }

    public CompareAbleSquare(double side) {
        super(side);
    }

    public CompareAbleSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public int compareTo(CompareAbleSquare o) {
        if (getSide() > o.getSide()) return 1;
        else if (getSide() < o.getSide()) return -1;
        return 0;
    }
}