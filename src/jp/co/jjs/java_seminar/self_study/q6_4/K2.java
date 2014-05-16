package jp.co.jjs.java_seminar.self_study.q6_4;

public class K2 extends J2 {
    String s = super.getClass().getName();
    public String getDescription(){
        return this.getClass().getName() + " " + s;
    }
}
