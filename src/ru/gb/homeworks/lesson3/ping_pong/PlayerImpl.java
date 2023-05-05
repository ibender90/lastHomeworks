package ru.gb.homeworks.lesson3.ping_pong;

public class PlayerImpl extends Thread implements Player{

    private final String message;

    public PlayerImpl(String message){
        this.message = message;
    }
    @Override
    public void play() {
        System.out.println(message);
    }

    @Override
    public void run() {
        play();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
