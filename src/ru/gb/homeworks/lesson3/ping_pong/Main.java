package ru.gb.homeworks.lesson3.ping_pong;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PlayerImpl player1 = new PlayerImpl("Ping");
        PlayerImpl player2 = new PlayerImpl("Pong");

        PingPong game = new PingPong(player1, player2, 10);

        game.startGame();

    }
}
