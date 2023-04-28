package ru.gb.homeworks.polymorph;

public abstract class GeometricShape {
    private Double area;

    abstract Double calcArea();

    public Double getArea() {
        return area;
    }
    protected void setArea(Double area) {
        this.area = area;
    }
}
