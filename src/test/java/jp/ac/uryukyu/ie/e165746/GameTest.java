package jp.ac.uryukyu.ie.e165746;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165746 on 2017/01/30.
 */
public class GameTest {
    @Test
    public void card_check() throws Exception {
        Player start = new Player();
        start.A[0] = 0;
        start.A[1] = 9;
        start.A[2] = 10;
        start.A[3] = 11;
        start.A[4] = 52;
        start.deck_sort();
        start.C = start.A;
        start.number_sort();
        start.card_check();
    }

}