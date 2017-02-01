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
    }
}
