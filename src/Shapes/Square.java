package Shapes;

public class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }

    public double getArea(){
        return Math.pow(length, 2);
    }

    public double getPerimeter(){
        return 4*width;
    }
}
