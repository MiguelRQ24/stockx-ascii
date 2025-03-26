package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.offer.Bid;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.offer.Offer;

import java.util.ArrayList;
import java.util.List;

public class Bids implements Criteria{

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
