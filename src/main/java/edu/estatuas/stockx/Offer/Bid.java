package edu.estatuas.stockx.Offer;

public class Bid implements Offer{
    private String size;
    private int bid;
    public Bid(String size, int bid){
        this.size = size;
        this.bid = bid;
    }

    @Override
    public int value() {
        return bid;
    }

    @Override
    public String toString(){
        return "\t\t" + size + "\t\t" + bid + "\n";
    }

    @Override
    public int compareTo(Offer offer){
        return offer.value() - value();
    }
}
