package jp.co.jjs.java_seminar.self_study.q4_2;

public class Exercise1 {

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        for(int i = count;i > 0;i--){
            if(i > 1){
                continue;
            }
            System.out.println("\u0007");
        }
    }

}
