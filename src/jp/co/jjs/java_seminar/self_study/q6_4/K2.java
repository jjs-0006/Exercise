package jp.co.jjs.java_seminar.self_study.q6_4;

public class K2 extends J2 {
    J2 j = new J2();
    String s = j.getClass().getName();
    public String getDescription(){
        return this.getClass().getName() + " " + s;
    }
}
