package com.mainacad;

import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

//    static String myName = "Hanna Lata";

    public static void main(String[] args) {

//     System.out.println("My name is " + myName);

        Square square1 = new Square();
        square1.setSide(28.0);
//      square1.setName("Square");

        System.out.println("Square with side " + square1.getSide() + " has area " + square1.getArea());

        Circle circle1 = new Circle();
        circle1.setRadius(10.0);

        System.out.println("Circle with radius " + circle1.getRadius() + " has area " + circle1.getArea());

        Triangle triangle1 = new Triangle();
        triangle1.setBase(15);
        triangle1.setHeight(20);

        System.out.println("Triangle with base " + triangle1.getBase() + " and height " + triangle1.getHeight() +
                " has area " + triangle1.getArea());

        Shape maxShape;

        if (circle1.getArea() > square1.getArea()) {
            maxShape = circle1;
        } else {
            maxShape = square1;
        }

        if (maxShape.getArea() < triangle1.getArea()) {
            maxShape = triangle1;
        }

        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " has area " + maxShape.getArea());

        Shape minShape;

        if (circle1.getArea() < square1.getArea()) {
            minShape = circle1;
        } else {
            minShape = square1;
        }

        if (minShape.getArea() > triangle1.getArea()) {
            minShape = triangle1;
        }

        System.out.println("Min shape is " + minShape.getClass().getSimpleName() + " has area " + minShape.getArea());


    }


}
