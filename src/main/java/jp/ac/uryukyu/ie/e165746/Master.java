package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2017/01/27.
 */

/**
 * マスターのクラス。
 */
public class Master extends Cardstock{
    public void play(){
        make_deck();
        A = Master_deck;
        deck_sort();
    }
}
