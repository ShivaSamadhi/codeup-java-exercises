package Shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        System.out.println("getPerimeter from Sq");
        return 4 * super.length;
    }

    @Override
    public double getArea() {
        System.out.println("getArea from Sq");
        return Math.pow(super.width, 2);
    }

    @Override
    public void setLength(double length) {
        this.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        this.setWidth(width);
    }
    //    public Square(double side){
//        super(side, side);
//    }
//
//    public double getArea(){
//        return Math.pow(length, 2);
//    }
//
//    public double getPerimeter(){
//        return 4*width;
//    }
}
