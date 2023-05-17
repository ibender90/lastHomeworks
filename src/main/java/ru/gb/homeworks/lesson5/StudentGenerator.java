package ru.gb.homeworks.lesson5;

import com.github.javafaker.Faker;

public class StudentGenerator {

    private StudentDao studentDao = new StudentDao();

    private static final int STUDENTS_TO_GENERATE = 1000;

    public void generateMeStudents() {

        studentDao.openCurrentSessionWithTransaction();

        Faker faker = new Faker();
        for (int i = 0; i < STUDENTS_TO_GENERATE; i++) {
            StudentEntity student = new StudentEntity();
            student.setName(faker.funnyName().name());
            student.setMark(faker.number().numberBetween(1, 5));
            studentDao.save(student);
        }

        studentDao.closeCurrentSessionWithTransaction();
    }
}
