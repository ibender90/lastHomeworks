package ru.gb.homeworks.lesson3.ping_pong;

public class PingPong {

    private static final Object ball = new Object();
    private final PlayerImpl player1;
    private final PlayerImpl player2;

    private final Integer rounds;

    public PingPong(PlayerImpl player1, PlayerImpl player2, Integer rounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
    }

    public void startGame() throws InterruptedException {
        synchronized (ball) {
            for (int i = 0; i < rounds; i++) {
                player1.run();
                player2.run();
            }
            System.out.println("game over");
        }
    }
}
