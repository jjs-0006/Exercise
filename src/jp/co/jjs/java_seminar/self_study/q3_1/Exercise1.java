package jp.co.jjs.java_seminar.self_study.q3_1;

public class Exercise1 {

    public static void main(String[] args) {
        int i = Integer.valueOf(args[0]);
        if(i % 2 == 0){
            System.out.println("偶数です");
        }
        else{
            System.out.println("奇数です");
        }

    }

}
