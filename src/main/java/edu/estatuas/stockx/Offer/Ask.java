package edu.estatuas.stockx.Offer;

public class Ask implements Offer{
    private String size;
    private Integer ask;
    public Ask(String size, int ask){
        this.size = size;
        this.ask = ask;
    }

    @Override
    public int value() {
        return ask;
    }

    @Override
    public String toString(){
        return "\t\t" + size + "\t\t" + ask + "\n";
    }

    @Override
    public int compareTo(Offer offer){
        return value() - offer.value() ;
    }
}
