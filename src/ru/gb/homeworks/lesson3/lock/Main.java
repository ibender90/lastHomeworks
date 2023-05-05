package ru.gb.homeworks.lesson3.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        Resource value = new Resource(0);
        Lock lock = new ReentrantLock();

        CounterThread counterThread1 = new CounterThread(value, lock, "counter1");
        CounterThread counterThread2 = new CounterThread(value, lock, "counter2");
        CounterThread counterThread3 = new CounterThread(value, lock, "counter3");
        CounterThread counterThread4 = new CounterThread(value, lock, "counter4");


            counterThread1.start();
            counterThread2.start();
            counterThread3.start();
            counterThread4.start();


    }
}
