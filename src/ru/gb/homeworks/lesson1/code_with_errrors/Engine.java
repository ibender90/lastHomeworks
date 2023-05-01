package ru.gb.homeworks.lesson1.code_with_errrors;

public abstract class Engine { // думаю лучше сделать абстрактный класс который уже будет реолизовать необходимые интерфейсы
   private String fuelType;
   private Integer power;

    public Engine(String fuelType, Integer power) {
        this.fuelType = fuelType;
        this.power = power;
    }
}
