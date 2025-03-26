package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.offer.Offer;

import java.util.List;

public class AndCriteria implements Criteria{
    Criteria criteria;
    Criteria otherCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria){
        this.criteria = firstCriteria;
        this.otherCriteria = secondCriteria;
    }
    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> otherCriteriaOffers = otherCriteria.checkCriteria(item);
        return criteria.checkCriteria(item).stream().filter(otherCriteriaOffers::contains).toList();

    }
}
