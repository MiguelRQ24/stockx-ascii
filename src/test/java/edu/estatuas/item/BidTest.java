package edu.estatuas.item;


import edu.estatuas.stockx.offer.Bid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BidTest {

    @Test
    public void constructorTest() {
        Bid bid = new Bid("9.5", 282);
        assertEquals(282, bid.value());
        assertEquals("9.5", bid.size());
    }
    
}
