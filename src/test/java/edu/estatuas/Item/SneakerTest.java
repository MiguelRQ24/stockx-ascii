package edu.estatuas.Item;

import edu.estatuas.stockx.Item.Sneaker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class SneakerTest {

    @Test
    public void testSneaker(){

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertEquals("555088-105", sneaker.getStyle());
    }

}
