package baitaploppoint2Dvaloppoint3D;

public class Point2D {
    protected float x, y;
    private float[] XY = new float[2];

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
        this.XY[0] = this.x;
        this.XY[1] = this.y;

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
        this.XY[0] = this.x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
        this.XY[1] = this.y;
    }

    public float[] getXY() {
        return this.XY;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() {
        return "X= " + this.x + " " + "Y= " + this.y + "\n"
                + "XY[0]" + XY[0] + " XY[1] " + XY[1];

    }
}
