package baitaploppoint2Dvaloppoint3D;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D ToaDoXY = new Point2D(2.0f, 3.0f);
        System.out.println(ToaDoXY.toString());
        ToaDoXY.setX(4.0f);
        ToaDoXY.setY(5.0f);
        System.out.println("\n\n" + ToaDoXY.toString());
        ToaDoXY.setXY(7.0f, 8.0f);
        System.out.println("\n\n" + ToaDoXY.toString());
    }
}
