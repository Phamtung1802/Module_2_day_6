package thuchanhlopcirclevalopcylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double Radius, String Color, double height) {
        super(Radius, Color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder with Radius= "+this.getRadius()+" Color= "+this.getColor()+"height= "+this.height;

    }
}
