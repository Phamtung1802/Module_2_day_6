package baitaploppointvamovepoint;

public class MovePoint extends Point {
    protected float xSpeed;
    protected float ySpeed;
    protected float[] xySpeed = new float[2];

    public MovePoint() {

    }

    public MovePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.xySpeed[0] = this.xSpeed;
        this.xySpeed[1] = this.ySpeed;
    }

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
        this.xySpeed[0] = this.xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
        this.xySpeed[1] = this.ySpeed;
    }

    public float[] getXySpeed() {
        return xySpeed;
    }

    public void setXySpeed(float xSpeed, float ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    @Override
    public String toString(){
        return super.toString()+"\n\nxSpeed= "+ this.xSpeed+ " ySpeed= "+this.ySpeed;
    }
}
