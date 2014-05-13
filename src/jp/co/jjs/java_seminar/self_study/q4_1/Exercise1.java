package jp.co.jjs.java_seminar.self_study.q4_1;

public class Exercise1 {

    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if(i > 0)
            if(i > 3)
                System.out.println("i > 0 and i > 3");
            else
                System.out.println("i > 0 and a <= 3");
        else
            System.out.println("i <= 0");

    }

}

//このプログラムは、10行目のelseは8行目、12行目のelseは7行目のifの関連付けられる。