package org.academiadecodigo.gnunas.captaindrink;

public enum Suit {
    DIAMONDS("diamonds/"),
    HEARTS("hearts/"),
    CLUBS("clubs"),
    SPADES("spades");

    private String path;

    Suit(String path) {
        this.path = path;
    }
}
