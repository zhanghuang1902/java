package com.javase.day02;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.r=5;
        double area = circle.findArea();
        System.out.println(area );
    }
}

class Circle{
    int r;

    public double findArea(){
        return 3.14*r*r;
    }
}