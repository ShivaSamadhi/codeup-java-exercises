package Shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        double radius = Input.getDouble();

        Circle circle = new Circle(radius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();

        System.out.printf("You created a circle with a radius of %s, an area of %s, and a circumference of %s", radius, area, circumference);
    }
}
