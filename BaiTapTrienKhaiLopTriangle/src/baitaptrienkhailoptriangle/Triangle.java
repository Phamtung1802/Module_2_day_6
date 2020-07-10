package baitaptrienkhailoptriangle;

public class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    public Triangle(){

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p=this.side1+this.side2+this.side3;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3))/4; //cong thuc heron
    }

    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }

    @Override
    public String toString(){
        return "A Triangle with color of "
                + this.getColor()
                + " and "
                + (isFilled() ? "filled\n\n" : "not filled\n\n" )
                + "Side1= "+getSide1()+" Side2= "+getSide2()+" Side3= "+getSide3()+"\n\n"
                + "Area= "+ this.getArea()+ " Perimeter= "+ this.getPerimeter();
    }
}
