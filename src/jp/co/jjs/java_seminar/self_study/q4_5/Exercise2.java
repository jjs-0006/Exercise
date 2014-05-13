package jp.co.jjs.java_seminar.self_study.q4_5;

public class Exercise2 {

    public static void main(String[] args) {
        int flag = 1;
        for(int i = 100;i <= 200;i++){
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    flag = 0;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
            flag = 1;
        }
    }
}
