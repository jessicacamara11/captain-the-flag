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

        ACE("Paranoia \n " +
                "The person on your right whispers you a question which the answer must be somebody playing the game" +
                "(e.g. Who is the hottest in the room?).\n" +
                "Your must respond out loud.\n" +
                "If someone wants to know what was the question, they have to drink.", "ace"),
        TWO("You drink.", "two"),
        THREE("Choose another player to drink", "three"),
        FOUR("Fuzzy Duck\n" +
                "Take turns saying the words \"fuzzy duck\".\n" +
                "A player may also opt to say \"does he?\", in which case play resumes in the opposite direction with players saying \"ducky fuzz\" instead.\n" +
                "If a player says the wrong thing, plays out of turn or breaks the rhythm of the game they must drink.", "four"),
        FIVE("Ping Pong\n" +
                "Take turns counting from 1.\n" +
                "When a number is multiple of 5 say \"Ping\" instead.\n" +
                "If it is a multiple of 7 say \"Pong\".\n" +
                "In case the number is a palindrome you must say \"Ping Pong\".\n" +
                "The first person to fail must drink.", "five"),
        SIX("Never Have I Ever\n" +
                "Say a statement about something that you've never done starting with \"Never have i ever...\"\n" +
                "Anyone who at some point in their life has done that, must drink.", "six"),
        SEVEN("Tubthumping\n" +
                "Listen to Tubthumping by Chumbawamba. Everyone drinks everytime you hear the word \"down\".", "seven"),
        EIGHT("Pick a mate\n" +
                "Pick someone to drink with you for the rest of the game.", "eight"),
        NINE("Pennies\n" +
                "Bounce a coin off the table into a short glass.\n" +
                "Miss? Drink. 3 in a row? Make a rule.", "nine"),
        TEN("Most Likely\n" +
                "Ask a most likely question. (e.g. Who would be most likely to fart in front of strangers?)\n" +
                "After counting to three everyone points at a person who they think are most likely to do so.\n" +
                "Who has more fingers pointed at them drinks as many sips.", "ten"),
        QUEEN("Medusa\n" +
                "Everyone looks down at the ground. At the count of three everyone looks up and fixes their gaze at another person in the room.\n" +
                "If you happen to lock eyes with someone you drink and are out.\n" +
                "Repeat until there are only 2 players left.", "queen"),
        JACK("Would you rather\n" +
                "Play a round of would you rather\n" +
                "The players who choose the least chosen of the two answers must drink.", "jack"),
        KING("Make a rule.", "king");

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
