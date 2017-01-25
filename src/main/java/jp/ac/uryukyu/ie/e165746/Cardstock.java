package jp.ac.uryukyu.ie.e165746;



/**
 * Created by e165746 on 2017/01/24.
 */

/**
 * カードの山札を作るクラス。
 */
public class Cardstock {
    int[] card = new int[54];
    String[] suit= {"Spade","Heart","Diamond","Clover","Joker"};
    //String[] suit= {"♠️","♡","♢","♣️","Joker"};

    /**
     * シャッフルされた山札を表示するメゾット。
     */
    public void deck() {
        for (int i = 0; i < 54; i++) {
            card[i] = i;
        }
        shuffle();
        for (int k = 0; k < 53; k++) {
            String ke = suit[card[k] / 13];
            if(card[k]/13 == 4){
                System.out.println(ke);
            }else {
                System.out.println(ke + "の" + (card[k] % 13 + 1));
            }
        }
    }
    /**
     * 山札をシャッフルするメゾット。
     */
    public void shuffle() {
        for (int t = 1; t <= 200; t++) {
            int i = (int) (Math.random() * 54);
            int j = (int) (Math.random() * 54);

            swap(i,j);
        }
    }

    /**
     * card[i]のcard[j]位置を入れ替えるメゾット。
     * @param i
     * @param j
     */
    public void swap(int i,int j){
        int temp;

        temp = card[i];
        card[i] = card[j];
        card[j] = temp;
    }
}
