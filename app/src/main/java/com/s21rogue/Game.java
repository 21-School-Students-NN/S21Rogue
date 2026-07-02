package com.s21rogue;

/**
 * Main class of our game. The Game!
 */
public class Game {
    public String getGreeting() {
        return "Hello, Rogue!";
    }

    public static void main(String[] args) {
        System.out.println(new Game().getGreeting());
    }
}
