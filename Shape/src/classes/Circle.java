package classes;

import interfaces.Shape;

public class Circle implements Shape {
    private float radius;
    @Override
    public double getarea() {
        double area = 0.5 * 3.14 * radius * radius;
        return area;
    }

    @Override
    public double getperimeter() {
        double preimeter = 2 * 3.14 * radius;
        return preimeter;
    }

    @Override
    public void Print() {
        System.out.println( "Shape : Circle");
        System.out.println( "");
        System.out.println( "");

        System.out.println( "Properties : ");
        System.out.println( "radius : " + radius);

        System.out.println( "");
        System.out.println( "");

        System.out.println( "Area : " + getarea());

        System.out.println( "Perimeter: " + getperimeter());
    }

    public Circle(float radius) {
        this.radius = radius;
    }
}
