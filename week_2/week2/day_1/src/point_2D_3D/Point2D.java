package point_2D_3D;

public class Point2D {
    private double x = 0;
    private double y = 0;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public void setXY(double x, double y) {
        this.y = y;
        this.x = x;
    }

    public double[] getXY() {
        double[] out = {this.x, this.y};
        return out;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")" + "\n";
    }
}