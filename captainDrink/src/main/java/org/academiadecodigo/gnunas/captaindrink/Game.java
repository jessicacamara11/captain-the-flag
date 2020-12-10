package org.academiadecodigo.gnunas.captaindrink;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Game {
    private List<Player> players;
    private Deck deck;

    public Game(){
        deck = new Deck();
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public Player randomPlayer(){
        int randomNumber = getRandomNumber();
        return players.get(randomNumber);
    }
    public int getRandomNumber() {
        return (int) Math.floor(Math.random()* players.size());
    }
    public Card getRandomCard(){
        return deck.draw();
    }
}
