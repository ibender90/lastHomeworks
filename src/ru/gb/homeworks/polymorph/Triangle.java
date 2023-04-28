package ru.gb.homeworks.polymorph;

public class Triangle extends GeometricShape {
    private Double height;
    private Double baseSideLength;

    public Triangle(Double height, Double baseSideLength) {
        this.height = height;
        this.baseSideLength = baseSideLength;
        super.setArea(calcArea());
    }

    @Override
    protected Double calcArea() {
         return (height*baseSideLength) / 2;
    }
}
