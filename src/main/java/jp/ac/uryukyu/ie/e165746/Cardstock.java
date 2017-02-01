package jp.ac.uryukyu.ie.e165746;

import java.util.Arrays;

/**
 * Created by e165746 on 2017/01/24.
 */

/**
 * カードの山札を作るクラス。
 */
public class Cardstock{
    int[] card = new int[54];
    int[] Player_deck = new int[5];
    int[] Master_deck = new int[5];
    int[] A = new int[5];
    int[] B = new int[5];
    int[] C = new int[5];
    int[] D = new int[5];

    String[] suit= {"Spade","Heart","Diamond","Clover","Joker"};
    //String[] suit= {"♠️","♡","♢","♣️","Joker"};

    /**
     * シャッフルされた手札を表示するメゾット。
     */
    public void make_deck() {
        for (int i = 0; i < 53; i++) {
            card[i] = i;
        }
        shuffle();
        for (int k = 0; k < 5; k++) {
            Player_deck[k] = card[k];    //山札の上から5枚をプレイヤーの手札とする。
            Master_deck[k] = card[k+5];  //さらに次の5枚をマスターの手札にする。
        }
    }

    /**
     * スートが強く、数字が小さい順で手札を表示させるメゾット。
     */
    public void deck_sort() {
        insertionsort(0,4);
        for(int p=0; p<5; p++){
            String ke = suit[A[p] / 13];
            if (A[p] / 13 == 4){
                System.out.println(ke);
            }else{
                System.out.println(suit[A[p] / 13] + "の" + (A[p] % 13 + 1));
            }
            B[p] = A[p]%13+1;  //Bはカードの数字が格納されている。
        }
    }

    /**
     * 数字を小さい順にソートするメゾット。
     * @param p
     * @param q
     */
    public void insertionsort(int p,int q){
        int i, j, c;

        for(j = p+1; j <= q; j++){
            c = A[j];
            i = j;
            while(i > p && A[i-1] > c){
                A[i] = A[i-1];
                i = i-1;
            }
            A[i] = c;
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
