package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        double value = Square(2);

        System.out.println("" +value);


        List<String> subject = new ArrayList<>();

        subject.add("Maths");
        subject.add("English");
        subject.add("History");

        Student  student = new Student();

        student.setId(1);
        student.setName("Jhon");
        student.setAge(20);
        student.setSubjects(subject);

        System.out.println("id : " + student.getId());
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println("Subject : " + student.getSubjects());

    }

    public static double Square(int a) {

        return Math.pow(a, 2);

    }


}

