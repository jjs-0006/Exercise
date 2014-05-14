package jp.co.jjs.java_seminar.self_study.q4_3;

public class Exercise1 {

    public static void main(String[] args) {
        int i = 0;
        double sum = 0;
        while(i < args.length){
            sum += Double.parseDouble(args[i]);
            i++;
        }
        System.out.println(sum);
    }

}
