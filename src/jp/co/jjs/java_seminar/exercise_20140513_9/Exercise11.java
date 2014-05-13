package jp.co.jjs.java_seminar.exercise_20140513_9;

public class Exercise11 {

    public static void main(String[] args) {
        int pay = 3624; //料金
        int out = 6000; //払ったお金
        int change = out - pay;   //おつり
        int[] money = {10000,5000,2000,1000,500,100,50,10,5,1}; //貨幣の金額
        System.out.println("買い物した金額:" + pay);
        System.out.println("支払った金額:" + out);
        for(int i = 0;i < money.length;i++){    //10000円から順におつりの数を求めていく
            int num = change / money[i];   //貨幣の数を求める
            change %= money[i];            //求めた数の分引く
            System.out.println(money[i] + "円:" + num);
        }
    }
}