package ru.gb.homeworks.code_with_errrors;

//class Lorry extends Car, Moveable, Stopable { можно наследоваться толькео от одного класса
    class Lorry extends Car implements Moveable, Stopable {

    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    public void open(){ // у суперкласса метод абстрактный, значит наследник должен его реализовать
        System.out.println("Lorry is opened");
    }
}
