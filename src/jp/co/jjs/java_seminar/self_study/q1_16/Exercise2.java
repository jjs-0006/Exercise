package jp.co.jjs.java_seminar.self_study.q1_16;

public class Exercise2 {

    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {1,2};
        int[] c = {1,2,3};
        int d[][] = {a,b,c};
        System.out.println(d.length);
        System.out.println(d[0].length + " " + d[1].length + " " + d[2].length);

    }

}
