package point_2D_3D;

public class Point3D extends Point2D {
    private double z = 0;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Point3D() {
    }

    public void setXYZ(double x, double y, double z) {
        super.setX(x);
        super.setY(y);
        this.z = z;

    }

    public double[] getXYZ() {
        double[] out = {this.getX(), this.getY(), this.z};
        return out;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + this.z + ")" + "\n";
    }

}