package ru.gb.homeworks.polymorph;

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
