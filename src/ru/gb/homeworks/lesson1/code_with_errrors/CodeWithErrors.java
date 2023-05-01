package ru.gb.homeworks.lesson1.code_with_errrors;

public class CodeWithErrors {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        lorry.setColor("black");
        lorry.setName("Lastochka");
        lorry.open();
        lorry.move();
    }
}
