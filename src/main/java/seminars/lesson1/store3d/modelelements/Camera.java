package seminars.lesson1.store3d.modelelements;

public class Camera {
    //TODO: Доработать в рамках домашней работы

    public void Rotate(Angle3D angle3D) {
        this.angle = angle3D;
    }

    public void Move(Point3D point3D) {
        this.location = point3D;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    private Point3D location;
    private Angle3D angle;
}
