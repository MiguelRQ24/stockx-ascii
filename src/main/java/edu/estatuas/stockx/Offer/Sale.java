package edu.estatuas.stockx.Offer;

public class Sale implements Offer{
    private String size;
    private Integer price;

    public Sale(String size, Integer price){
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return getSize();
    }

    @Override
    public int value() {
        return getPrice();
    }

    @Override
    public int compareTo(Offer offer) {
        return offer.value() - value();
    }

    @Override
    public String toString() {
        return "\t\t" + size + "\t\t" + price + "\n";
    }

    public Integer getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
