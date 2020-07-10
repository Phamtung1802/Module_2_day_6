package baitaploppoint2Dvaloppoint3D;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D ToaDoXYZ = new Point3D(2.0f, 3.0f,4.0f);
        System.out.println(ToaDoXYZ.toString());
        ToaDoXYZ.setX(4.0f);
        ToaDoXYZ.setY(5.0f);
        ToaDoXYZ.setZ(5.0f);
        System.out.println("\n\n" + ToaDoXYZ.toString());
        ToaDoXYZ.setXYZ(7.0f, 8.0f, 9.0f);
        System.out.println("\n\n" + ToaDoXYZ.toString());
    }
}
