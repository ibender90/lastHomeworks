package ru.gb.homeworks.lesson3.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class CounterThread extends Thread {
    private Resource somethingToCount;
    private String counterName;

    private Lock lock;

    public CounterThread(Resource somethingToCount, Lock lock, String counterName) {
        this.somethingToCount = somethingToCount;
        this.lock = lock;
        this.counterName = counterName;
    }

    @Override
    public void run() {
        boolean finished = false;
        try {
            while (!finished) {
                if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    lock.lock();
                    System.out.println(counterName + " locked");
                    try {
                        somethingToCount.setValue(somethingToCount.getValue() + 1);
                        System.out.println(counterName + " increased value :" + somethingToCount.getValue());
                        if (somethingToCount.getValue() == 100) {
                            finished = true;
                        }
                    } finally {
                        lock.unlock();
                        System.out.println(counterName + " unlocked");
                    }
                }
                }
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
    }
}