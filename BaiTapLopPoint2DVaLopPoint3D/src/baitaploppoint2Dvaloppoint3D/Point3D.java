package baitaploppoint2Dvaloppoint3D;

public class Point3D extends Point2D{
    float z;
    private float[] XYZ=new float[3];

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
        this.XYZ[0]=this.x;
        this.XYZ[1]=this.y;
        this.XYZ[2]=this.z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
        XYZ[2]=this.z;
    }


    @Override
    public void setX(float x){
        this.x=x;
        XYZ[0]=this.x;
    }

    @Override
    public void setY(float y){
        this.y=y;
        XYZ[1]=this.y;
    }

    public float[] getXYZ() {
        return XYZ;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    @Override
    public String toString(){
        return "X= "+this.x +" "+ "Y= "+ this.y+" Z= "+this.z+"\n"
                + "XYZ[0]= "+ XYZ[0]+ " XYZ[1]= "+ XYZ[1]+" XYZ[2]= "+ XYZ[2];

    }
}
