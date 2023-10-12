package seminars.lesson1.store3d.modelelements;

public class Angle3D {

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

    public Angle3D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double x, y;
}
