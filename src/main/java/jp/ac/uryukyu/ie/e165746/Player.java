package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2017/01/27.
 */

/**
 * プレイヤーのクラス。
 */
public class Player extends Cardstock{
    public void play(){
        make_deck();
        A = Player_deck;
        deck_sort();
    }
}
