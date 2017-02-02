package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2017/01/27.
 */

/**
 * マスターのクラス。
 */
public class Master extends Game{
    public void play(){
        make_deck();
        A = Master_deck;
        deck_sort();
        card_check(card_number);
    }
}
