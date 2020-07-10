package baitaploppointvamovepoint;

public class Point {
    protected float x;
    protected float y;
    protected float[] XY = new float[2];

    public Point() {
    }

    public Point(float x, float y) {
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
        return this.x + ", " + this.y;
    }

}
