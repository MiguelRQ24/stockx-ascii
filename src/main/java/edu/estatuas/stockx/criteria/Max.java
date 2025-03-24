package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Offer.Offer;

import java.util.List;

public class Max implements Criteria{
    Criteria criteria;
    Criteria otherCriteria;

    public Max(Criteria firstCriteria, Criteria secondCriteria){
        this.criteria = firstCriteria;
        this.otherCriteria = secondCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> otherCriteriaOffers = otherCriteria.checkCriteria(item);
        return criteria.checkCriteria(item).stream().filter(otherCriteriaOffers::contains).sorted(Offer::compareTo).toList();
    }
}
