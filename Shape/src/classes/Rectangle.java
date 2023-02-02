package classes;

import interfaces.Shape;

public class Rectangle implements Shape {
    private float length;
    private float height;

    public Rectangle(float length, float height) {
        this.length = length;
        this.height = height;


    }

    public float getLength() {
        return length;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public double getarea() {

        double area = length * height;
        return area;
    }

    @Override
    public double getperimeter() {
        double perimeter = 2*(height+length);
        return perimeter;
    }

    public void Print() {
        System.out.println( "Shape : Rectangle");
        System.out.println( "");
        System.out.println( "");

        System.out.println( "Properties : ");
        System.out.println( "Width : " + length);
        System.out.println( "Height : " + height);



        System.out.println( "");
        System.out.println( "");

        System.out.println( "Area : " + getarea());

        System.out.println( "Perimeter: " + getperimeter());
    }
}

