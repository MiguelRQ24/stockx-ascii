package edu.estatuas.criteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;


import edu.estatuas.stockx.criteria.*;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.offer.Ask;
import edu.estatuas.stockx.offer.Bid;
import edu.estatuas.stockx.offer.Offer;
import edu.estatuas.stockx.item.Sneaker;


public class MinTest {

    @Test
    public void checkCriteria_max_size_bid_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));


        Criteria size = new Size("13");
        Criteria asks = new Asks();
        Criteria min = new Min(size, asks);

        List<Offer> filteredSize = min.checkCriteria(sneaker);
        assertTrue(filteredSize.stream().allMatch(o -> o.size().equals("13")));
        assertTrue(filteredSize.stream().allMatch(o -> o instanceof Ask));
        assertEquals(333, filteredSize.getFirst().value());

    }

    @Test
    public void checkCriteria_no_max_test() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");

        Criteria size = new Size("13");
        Criteria bids = new Bids();
        Criteria min = new Min(size, bids);

        List<Offer> filteredSize = min.checkCriteria(sneaker);
        assertTrue(filteredSize.isEmpty());
    }    
}
