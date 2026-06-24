package com.s21rogue;

/**
 * Main calss of the our game. The Game!
 */
public class Game {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Game().getGreeting());
    }
}
