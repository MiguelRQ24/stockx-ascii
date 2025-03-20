package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Offer.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
