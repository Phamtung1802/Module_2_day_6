package thuchanhlopcirclevalopcylinder;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle Circle=new Circle(1.0,"Red");
        Cylinder Cylinder=new Cylinder(2.0,"blue",5.0);
        System.out.println(Circle.toString()+"\n\n"+Cylinder.toString());
    }
}
