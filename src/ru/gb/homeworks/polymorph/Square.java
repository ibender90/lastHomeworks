package ru.gb.homeworks.polymorph;

public class Square extends GeometricShape{

    private Double sideLength;

    public Square(Double sideLength) {
        this.sideLength = sideLength;
        super.setArea(calcArea());
    }

    @Override
    protected Double calcArea() {
        return sideLength * sideLength;
    }
}
