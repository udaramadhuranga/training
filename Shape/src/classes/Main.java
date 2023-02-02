package classes;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String ShapeName;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Shape type: ");

        ShapeName= sc.nextLine();

        if(ShapeName.equals("Rectangle") || ShapeName.equals("rectangle")){

           float Width;
           float height;

            System.out.print("Enter Width: ");
            Width= sc.nextFloat();
            System.out.print("Enter height: ");
            height = sc.nextFloat();

            Rectangle rec = new Rectangle(Width,height);

            rec.Print();

        }else if (ShapeName.equals("Square") || ShapeName.equals("square") ){
            float length;
            System.out.print("Enter length ");
            length= sc.nextFloat();
            Square sqr = new Square(length);

            sqr.Print();

        }else if (ShapeName.equals("Circle") || ShapeName.equals("circle")){
            float radius;
            System.out.print("Enter radius ");
            radius= sc.nextFloat();
            Circle crle = new Circle(radius);
            crle.Print();
        }else{
            System.out.println("Sorry! Unrecognized Shape  ");
        }




    }



}
