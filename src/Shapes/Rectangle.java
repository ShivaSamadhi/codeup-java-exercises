package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        System.out.println("getPerimeter from Rect");
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        System.out.println("getArea from Rect");
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
    //    protected double width;
//    protected double length;
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getArea(){
//        return width * length;
//    }
//
//    public double getPerimeter(){
//        return  2*length + 2*width;
//    }
}
