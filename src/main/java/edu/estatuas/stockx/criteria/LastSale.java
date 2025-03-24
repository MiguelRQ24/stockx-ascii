package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Offer.Offer;
import edu.estatuas.stockx.Offer.Sale;

import java.util.ArrayList;
import java.util.List;

public class LastSale implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = new ArrayList<>();
        for (Offer offer: item.getOffers()){
            if (offer.getClass() == Sale.class){
                offers.add(offer);
            }
        }
        return offers.reversed();
    }
}
