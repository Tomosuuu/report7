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
        //手札　（数字）% 13 + 1　が手札の数字となる。
        //0~12はスペード, 13~25はハート, 26~38はダイヤ, 39~51はクローバー, 52はジョーカー
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