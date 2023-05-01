package ru.gb.homeworks.lesson1.polymorph;

public class Circle extends GeometricShape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        super.setArea(calcArea());
    }

    @Override
    Double calcArea() {
        return radius * radius * Math.PI;
    }
}
