package jp.co.jjs.java_seminar.self_study.q3_4;

public class Exercise3 {

    public static void main(String[] args) {
        int n  = 10;
        System.out.println(n + "の因数は");
        for(int i = n - 1;i > 1;i--){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }

}
