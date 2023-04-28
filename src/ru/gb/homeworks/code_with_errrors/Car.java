package ru.gb.homeworks.code_with_errrors;

public abstract class Car { // конструктор был бы ен лишним
    public Engine engine; // поле дожно быть private, здесь геттеры и сеттеры не имеют смысла
    private String color;
    private String name;
    protected void start() {
        System.out.println("Car starting");
    }
    abstract void open();
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
