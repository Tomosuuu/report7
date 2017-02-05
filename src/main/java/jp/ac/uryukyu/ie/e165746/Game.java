package jp.ac.uryukyu.ie.e165746;

/**
 * Breated by e165746 on 2017/01/25.
 */

/**
 * 役を判断するクラス。
 */
public class Game extends Cardstock{
    int num = 0;

    /**
     * ジョーカーがある時とない時で役を判断して関数を呼び出すメソッド。
     */
    public void card_check(int[] A){
        if (A[4] == 1){
            is_joker(A);
        }else {
            not_joker(A);
        }
    }

    /**
     * ジョーカーがある時に役を判断するメソッド。
     */
    public void is_joker(int[] A){
        if (A[0] == A[1] && A[0] == A[2] && A[0] == A[3]) {
            num = 10; //ファイブカード
        } else if (A[0] == A[1] && A[0] == A[2] || A[1] == A[2] && A[1] == A[3]) {
            num = 7; //フォーカード
        } else if (A[0] == A[1] && A[2] == A[3]) {
            num = 6; //フルハウス
        } else if (A[0] < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < A[0]+5) {
            num = 4; //ストレート
            if (B[0]/13 == B[1]/13 && B[1]/13 == B[2]/13 && B[2]/13 == B[3]/13) {
                num = 8; //ストレートフラッシュ
            }
        } else if (A[0] == A[1] || A[1] == A[2] || A[2] == A[3]) {
            num = 3; //スリーカード
        } else {
            num = 1; //ワンペア
            if (A[0] == 1 && 9 < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < 14 || 9 < A[0] && A[0] < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < 14) {
                if (B[3]/13<1) {
                    num = 9; //ロイヤルストレートフラッシュ
                }
            }else if (B[0]/13 == B[1]/13 && B[1]/13 == B[2]/13 && B[2]/13 == B[3]/13){
                num = 5; //フラッシュ
            }
        }
        part_check();
    }

    /**
     * ジョーカーがない時に役を判断するメソッド。
     */
    public void not_joker(int[] A) {
        if (A[0] == A[1] && A[0] == A[2] && A[0] == A[3]) {
            num = 7; //フォーカード
        } else if ((A[0] == A[1] && A[0] == A[2] && A[3] == A[4]) || (A[0] == A[1] && A[2] == A[3] && A[2] == A[4])) {
            num = 6; //フルハウス
        } else if (A[0] < A[1] && A[1] < A[2] && A[2] < A[3] && A[3] < A[4] && A[4] < A[0]+5) {
            num = 4; //ストレート
            if (B[0]/13 == B[1]/13 && B[1]/13 == B[2]/13 && B[2]/13 == B[3]/13 && B[3]/13 == B[4]/13) {
                num = 8; //ストレートフラッシュ
            }
        } else if (A[0] == A[1] && A[0] == A[2] || A[1] == A[2] && A[1] == A[3] || A[2] == A[3] && A[2] == A[4]) {
            num = 3; //スリーカード
        } else if (A[0] == A[1] && A[2] == A[3] || A[1] == A[2] && A[3] == A[4] || A[0] == A[1] && A[3] == A[4]) {
            num = 2; //ツーペア
        } else if (A[0] == A[1] || A[1] == A[2] || A[2] == A[3] || A[3] == A[4]) {
            num = 1; //ワンペア
        } else {
            num = 0; //ノーペア
            if (A[0] == 1 && A[1] == 10 && A[2] == 11 && A[3] == 12 && A[4] == 13) {
                if (B[4]/13<1) {
                    num = 9; //ロイヤルストレートフラッシュ
                }
            }else if (B[0]/13 == B[1]/13 && B[1]/13 == B[2]/13 && B[2]/13 == B[3]/13 && B[3]/13 == B[4]/13) {
                num = 5; //フラッシュ
            }
        }
        part_check();
    }

    /**
     * 役の名前を出力するメソッド。
     * is_joker()もしくはnot_joker()によってnumに数字が入り、ここで出力する内容を判断している。
     */
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
