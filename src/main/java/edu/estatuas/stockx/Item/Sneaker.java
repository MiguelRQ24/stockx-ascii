package edu.estatuas.stockx.Item;

import edu.estatuas.stockx.Offer.Offer;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    private String style;
    private String name;
    private int bid;
    private int ask;
    private int sale;
    private List<Offer> offers = new ArrayList<>();

    public Sneaker(String style, String name){
        this.style = style;
        this.name = name;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getAsk() {
        return ask;
    }

    @Override
    public int getBid() {
        return bid;
    }

    @Override
    public int getSale() {
        return sale;
    }

    @Override
    public String toString(){
        return name + "\n\t\t" + style;
    }

    @Override
    public void add(Offer offer){
        this.offers.add(offer);
    }

    @Override
    public List<Offer> getOffers(){
        return offers;
    }
}
