package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.Offer.Bid;
import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Offer.Offer;

import java.util.ArrayList;
import java.util.List;

public class MaxBid implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item){
        List<Offer> offers = new ArrayList<>();
        for (Offer offer: item.getOffers()){
            if (offer.getClass() == Bid.class){
                offers.add(offer);
            }
        }
        offers.sort(Offer::compareTo);
        return offers;
    }

}
