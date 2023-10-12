package seminars.lesson1.store3d.modelelements;

public class Flash {
    //TODO: Доработать в рамках домашней работы

    public void Rotate(Angle3D angle3D) {
        this.angle = angle3D;
    }

    public void Move(Point3D point3D) {
        this.locaton = point3D;
    }

    public Point3D getLocaton() {
        return locaton;
    }

    public void setLocaton(Point3D locaton) {
        this.locaton = locaton;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public Flash(Point3D locaton, Angle3D angle, Color color, Power power) {
        this.locaton = locaton;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    private Point3D locaton;
    private Angle3D angle;
    private Color color;
    private Power power;
}
