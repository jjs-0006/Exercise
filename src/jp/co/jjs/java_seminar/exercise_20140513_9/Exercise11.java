package jp.co.jjs.java_seminar.exercise_20140513_9;

public class Exercise11 {

    public static void main(String[] args) {
        int pay = 3624;
        int out = 6000;
        int change = out - pay;
        int[] money = {10000,5000,2000,1000,500,100,50,10,5,1};
        System.out.println("買い物した金額:" + pay);
        System.out.println("支払った金額:" + out);
        for(int i = 0;i < money.length;i++){
            int num = change / money[i];
            change %= money[i];
            System.out.println(money[i] + "円:" + num);
        }
    }

}