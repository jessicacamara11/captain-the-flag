package org.academiadecodigo.gnunas.captaindrink;

import java.util.List;

public class Player {

    private String name;
    private int drinksCounter = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrinksCounter() {
        return drinksCounter;
    }

    public void setDrinksCounter(int drinksCounter) {
        this.drinksCounter = drinksCounter;
    }
    public void drink(){
        drinksCounter++;
    }
}
