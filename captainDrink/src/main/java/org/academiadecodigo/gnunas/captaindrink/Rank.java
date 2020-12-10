package org.academiadecodigo.gnunas.captaindrink;

public enum Rank {

    ACE("You have to do bad stuff", "ace"),
    TWO("You have to do bad stuff", "two"),
    THREE("You have to do bad stuff", "three"),
    FOUR("You have to do bad stuff", "four"),
    FIVE("You have to do bad stuff", "five"),
    SIX("You have to do bad stuff", "six"),
    SEVEN("You have to do bad stuff", "seven"),
    EIGHT("You have to do bad stuff", "eight"),
    NINE("You have to do bad stuff", "nine"),
    TEN("You have to do bad stuff", "ten"),
    QUEEN("You have to do bad stuff", "queen"),
    JACK("You have to do bad stuff", "jack"),
    KING("You have to do bad stuff", "king");

    private String action;
    private String path;


    Rank(String action, String path) {
        this.action = action;
        this.path = path;
    }

    public String getAction() {
        return action;
    }

    public String getPath() {
        return path;
    }
}
