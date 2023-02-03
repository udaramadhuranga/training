package org.example;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Student {
   @Getter @Setter private int id;
    @Setter @Getter private String name;

    @Setter @Getter private int age;

    @Setter @Getter private List<String> subjects;

//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public List<String> getSubjects() {
//        return subjects;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setSubjects(List<String> subjects) {
//        this.subjects = subjects;
//    }
//
//    public Student(int id, String name, int age, List<String> subjects) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.subjects = subjects;
//    }

    public Student() {
    }
}
