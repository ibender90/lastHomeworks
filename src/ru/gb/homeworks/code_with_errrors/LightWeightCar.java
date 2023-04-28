package ru.gb.homeworks.code_with_errrors;

public class LightWeightCar extends Car implements Moveable {  //логичнее сделать суперкласс extends movable
    // можно Stopable и Movable объединить в 1 интерфейс, эта машина поедет, но не остановится
    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

}
