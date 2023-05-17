package ru.gb.homeworks.lesson5;

public class Test {
    public static void main(String[] args) {


        StudentGenerator generator = new StudentGenerator();
        generator.generateMeStudents();

        StudentDao studentDao = new StudentDao();
        studentDao.openCurrentSession();

        System.out.println(studentDao.findAll());

        studentDao.closeCurrentSession();
    }
}
