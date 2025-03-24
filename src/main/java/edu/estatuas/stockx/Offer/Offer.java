package edu.estatuas.stockx.Offer;

public interface Offer {
    String size();
    int value();
    int compareTo(Offer offer);
}
