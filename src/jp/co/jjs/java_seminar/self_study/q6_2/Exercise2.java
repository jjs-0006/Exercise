package jp.co.jjs.java_seminar.self_study.q6_2;

public class Exercise2 {

    public static void main(String[] args) {
        S s = new S();
        T t = new T();
        s.x = 1;
        t.x = new StringBuffer("a");;
        System.out.println(s.x + " " + t.x);

    }

}
