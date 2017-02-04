package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2017/01/27.
 */

/**
 * プレイヤーのクラス。
 */
public class Player extends Game{
    public void play(){
        deck_sort(Player_deck);
        card_check(card_number);
    }
}
