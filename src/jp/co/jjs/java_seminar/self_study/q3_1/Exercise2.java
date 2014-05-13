package jp.co.jjs.java_seminar.self_study.q3_1;

public class Exercise2 {

    public static void main(String[] args) {
        double d;
        if(args[1].equals("feet")){
            d = Integer.valueOf(args[0]) / 3.28;
            System.out.println("");
        }
        else if(args[1].equals("meter")){
            d = Integer.valueOf(args[0]) * 3.28;

        }

    }

}
