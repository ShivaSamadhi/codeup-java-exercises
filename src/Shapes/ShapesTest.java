package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        Square box2 = new Square(5);

        Measurable myShape;
        myShape = box1;
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = box2;
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
    }
}
