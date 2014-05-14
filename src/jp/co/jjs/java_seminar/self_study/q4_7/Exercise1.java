package jp.co.jjs.java_seminar.self_study.q4_7;

public class Exercise1 {

    public static void main(String[] args) {
        for(int i = 1;i < 101;i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

    }

}
