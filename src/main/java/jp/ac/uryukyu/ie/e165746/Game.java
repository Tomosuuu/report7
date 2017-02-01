package jp.ac.uryukyu.ie.e165746;

/**
 * Created by e165746 on 2017/01/25.
 */
public class Game extends Cardstock{
    int num = 0;
    public void card_check(){
        if (A[4] == 1){
            is_jocker();
        }else {
            not_jocker();
        }
    }
    public void is_jocker(){
        if (A[0] == A[1] && A[0] == A[2] && A[0] == A[3]) {
            num = 10;
        } else if (A[0] == A[1] && A[0] == A[2] || A[1] == A[2] && A[1] == A[3]) {
            num = 7;
        } else if (A[0] == A[1] && A[2] == A[3]) {
            num = 6;
        } else if (A[0] < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < A[0]+5) {
            num = 4;
            if (C[0]/13 == C[1]/13 && C[1]/13 == C[2]/13 && C[2]/13 == C[3]/13) {
                num = 8;
            }
        } else if (A[0] == A[1] || A[1] == A[2] || A[2] == A[3]) {
            num = 3;
        } else {
            num = 1;
            if (A[0] == 1 && 9 < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < 14 || 9 < A[0] && A[0] < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < 14) {
                if (C[3]/13<1) {
                    num = 9;
                }
            }else if (C[0]/13 == C[1]/13 && C[1]/13 == C[2]/13 && C[2]/13 == C[3]/13){
                num = 5;
            }
        }
        part_check();
    }
    public void not_jocker() {
        if (A[0] == A[1] && A[0] == A[2] && A[0] == A[3]) {
            num = 7;
        } else if ((A[0] == A[1] && A[0] == A[2] && A[3] == A[4]) || (A[0] == A[1] && A[2] == A[3] && A[2] == A[4])) {
            num = 6;
        } else if (A[0] < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < A[4] && A[4] < A[0]+5) {
            num = 4;
            if (C[0]/13 == C[1]/13 && C[1]/13 == C[2]/13 && C[2]/13 == C[3]/13 && C[3]/13 == C[4]/13) {
                num = 8;
            }
        } else if (A[0] == A[1] && A[0] == A[2] || A[1] == A[2] && A[1] == A[3] || A[2] == A[3] && A[2] == A[4]) {
            num = 3;
        } else if (A[0] == A[1] && A[2] == A[3] || A[1] == A[2] && A[3] == A[4] || A[0] == A[1] && A[3] == A[4]) {
            num = 2;
        } else if (A[0] == A[1] || A[1] == A[2] || A[2] == A[3] || A[3] == A[4]) {
            num = 1;
        } else {
            num = 0;
            if (A[0] == 1 && A[1] == 10 && A[2] == 11 && A[3] == 12 && A[4] == 13) {
                if (C[4]/13<1) {
                    num = 9;
                }
            }else if (C[0]/13 == C[1]/13 && C[1]/13 == C[2]/13 && C[2]/13 == C[3]/13 && C[3]/13 == C[4]/13) {
                num = 5;
            }
        }
        part_check();
    }

    public void part_check(){
        switch (num){
            case 0:
                System.out.println("ノーペア");
                break;
            case 1:
                System.out.println("ワンペア");
                break;
            case 2:
                System.out.println("ツーペア");
                break;
            case 3:
                System.out.println("スリーカード");
                break;
            case 4:
                System.out.println("ストレート");
                break;
            case 5:
                System.out.println("フラッシュ");
                break;
            case 6:
                System.out.println("フルハウス");
                break;
            case 7:
                System.out.println("フォーカード");
                break;
            case 8:
                System.out.println("ストレートフラッシュ");
                break;
            case 9:
                System.out.println("ロイヤルストレートフラッシュ");
                break;
            case 10:
                System.out.println("ファイブカード");
        }
    }
}
