package edu.estatuas.stockx.offer;

public interface Offer {
    String size();
    int value();
    int compareTo(Offer offer);
}
