package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.offer.Offer;

import java.util.List;

public class Size implements Criteria{
    private String size;

    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.getOffers().stream().filter(a -> a.size().equals(size)).toList();
    }
}
