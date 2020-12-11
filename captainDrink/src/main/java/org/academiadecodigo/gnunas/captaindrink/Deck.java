package org.academiadecodigo.gnunas.captaindrink;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    List<Card> cards = new LinkedList<>();


    public void assemble() {

        for (Card.Suit suit : Card.Suit.values()) {
            assembleCardsWithSuit(suit);
        }
    }

    public void shuffle() {

        Collections.shuffle(cards);
    }

    private void assembleCardsWithSuit(Card.Suit suit) {

        for (Card.Rank rank : Card.Rank.values()) {
            cards.add(new Card(rank, suit));
        }
    }

    public Card draw() {
        int randomNumber = (int) (Math.random() * cards.size());

        return cards.get(randomNumber);
    }
}
