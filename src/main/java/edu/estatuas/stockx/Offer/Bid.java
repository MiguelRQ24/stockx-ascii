package edu.estatuas.stockx.Offer;

public class Bid implements Offer{
    private String size;
    private Integer bid;
    public Bid(String size, int bid){
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return getSize();
    }

    @Override
    public int value() {
        return getBid();
    }

    @Override
    public String toString(){
        return "\t\t" + size + "\t\t" + bid + "\n";
    }

    @Override
    public int compareTo(Offer offer){
        return offer.value() - value();
    }

    public String getSize() {
        return size;
    }

    public Integer getBid() {
        return bid;
    }
}
