package ru.gb.homeworks.lesson1.polymorph;

public class shapesTest {
    public static void main(String[] args) {
        GeometricShape square = new Square(4.0D);
        GeometricShape triangle = new Triangle(12.0, 5.0);
        GeometricShape circle = new Circle(22.0);

        System.out.println("area of the square: " + square.getArea());
        System.out.println( "area of the triangle: " + triangle.getArea());
        System.out.println("area of the circle: " + circle.getArea());
    }
}
