package jp.co.f1.superintro.ch8;
import java.util.Scanner;

public class HighAndLow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

        int card_nam = (int)(Math.random()*9)+1;;
        String card_output = "　　【問題表示】\r\n***** *****\r\n" +
                "*   *  *  *  *\r\n* "+card_nam+" *  *  *  *\r\n*   *  *  *  *\r\n***** *****\r\n" +
                "High　　or　　Low ?(h/l) >";
        System.out.println(card_output);
        String str =sc.nextLine();

        int ipt_num = (int)(Math.random()*9)+1;
        int num[] = {card_nam,ipt_num};

        if (str.equals("l")){
                System.out.println("→Low を選択しました。");
                boolean bln[] = {card_nam>ipt_num,card_nam<ipt_num};
                hantei(bln, num);
        }else if (str.equals("h")){
                System.out.println("→High を選択しました。");
                boolean bln[] = {card_nam<ipt_num,card_nam>ipt_num};
                hantei(bln, num);
        }else{
                System.out.println("→選択項目以外の値が入力されました。終了します。");
                break;
        }
        }

    }
    private static void hantei(boolean bln[],int num[]){
        if(bln[0]){
            String str = "→You Win!";
            hyouzi(str,num);
        }else if(bln[1]){
            String str = "→You Lose...";
            hyouzi(str,num);
            System.out.println("ゲーム終了...");
            System.exit(0);
        }else{
            String str = "→You Win!";
            hyouzi(str,num);
        }

    }
    private static void hyouzi(String str,int num[]){
        String card_output = "　　【結果表示】\r\n***** *****\r\n" +
                "*   *  *   *\r\n* "+num[0]+" *  * "+num[1]+" *\r\n*   *  *   *\r\n***** *****\r\n" +
                str;
        System.out.println(card_output);
    }
}
