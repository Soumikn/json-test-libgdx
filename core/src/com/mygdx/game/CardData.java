package com.mygdx.game;

import java.util.ArrayList;

public class CardData {
//    public ArrayList array;


    public String card;
    public String temper;

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getTemper() {
        return temper;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public CardData(String card, String temper) {
        this.card = card;
        this.temper = temper;
    }
}

