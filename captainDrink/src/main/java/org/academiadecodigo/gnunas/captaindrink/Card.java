package org.academiadecodigo.gnunas.captaindrink;

public class Card {
    private final Rank rank;
    private final Suit suit;


    public Card(Rank rank, Suit suit) {

        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {

        return suit;
    }

    public Rank getRank() {

        return rank;
    }
    public String getImgPath(){
        return suit.getPath() + rank.getPath();
    }
    public enum Suit {
        DIAMONDS("diamonds/"),
        HEARTS("hearts/"),
        CLUBS("clubs/"),
        SPADES("spades/");

        private String path;

        Suit(String path) {
            this.path = path;
        }

        public String getPath() {
            return path;
        }
    }
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
}
