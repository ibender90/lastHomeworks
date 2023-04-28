package ru.gb.homeworks.builder;

public class Main {
    public static void main(String[] args) {

        Person person = new Person.PersonBuilder()
                .firstName("Mock first name")
                .lastName("Mock last name")
                .middleName("Mock middle name")
                .address("Mock address")
                .country("Mock country")
                .gender("Mock gender")
                .phone("Mock phone")
                .age(0)
                .build();

        System.out.println(person);
    }
}