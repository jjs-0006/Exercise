package jp.co.jjs.java_seminar.self_study.q3_2;

public class Exercise1 {
    public static void main(String[] args) {
        double d1 = Double.valueOf(args[0]);
        double d2 = Double.valueOf(args[1]);
        if(d2 == 0){
            System.out.println("2つ目の引数が0です");
        }
        else{
            System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
        }
        int count = 90;
    }
}
