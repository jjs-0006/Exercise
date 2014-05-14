package jp.co.jjs.java_seminar.self_study.q1_16;

public class Exercise1 {

    public static void main(String[] args) {
        float[] a = {-56.7f};
        float[] b = {500.1f,70.70f};
        float[] c = {100.9f,0.5f,20.20f};
        float[][] d = {a,b,c};
        System.out.println(d[0][0]);
        System.out.println(d[1][0] + " " + d[1][1]);
        System.out.println(d[2][0] + " " + d[2][1] + " " + d[2][2]);

    }

}
