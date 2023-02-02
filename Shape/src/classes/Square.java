package classes;

import interfaces.Shape;

public class Square implements Shape {

    private float length;

    public Square(float length) {
        this.length = length;
    }

    @Override
    public double getarea() {

        double area =  length * length;
        return area ;
    }

    @Override
    public double getperimeter() {

        double perimeter = 4 * length;
        return perimeter;
    }

    public void Print() {
        System.out.println( "Shape : Square");
        System.out.println( "");
        System.out.println( "");

        System.out.println( "Properties : ");
        System.out.println( "Length : " + length);

        System.out.println( "");
        System.out.println( "");

        System.out.println( "Area : " + getarea());

        System.out.println( "Perimeter: " + getperimeter());
    }
}


