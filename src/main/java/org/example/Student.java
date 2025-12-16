package org.example;

public class Student {
    public String name;
    public  double grade;

    public Student (String name, Double grade){
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

}