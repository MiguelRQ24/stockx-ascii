package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Offer.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria{
    private String size;

    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.getOffers().stream().filter(a -> a.size().equals("9.5")).toList();
    }
}
