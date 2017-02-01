package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2017/01/24.
 */
public class Main {
    public static void main(String[] args) {
        Master start1 = new Master();
        Player start2 = new Player();

        System.out.println("Master's deck");
        start1.play();

        System.out.println("\nPlayer's deck");
        start2.play();

        if (start1.num>start2.num){
            System.out.println("\nlose");
        }else if (start1.num == start2.num){
            System.out.println("\nDraw");
        }else {
            System.out.println("\nwin");
        }
    }
}
