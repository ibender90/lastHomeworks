package ru.gb.homeworks.lesson3.lock;

public class Resource {
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public Resource(Integer value) {
        this.value = value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
