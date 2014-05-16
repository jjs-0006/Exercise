package jp.co.jjs.java_seminar.self_study.q6_4;

public class J2 extends I2 {
    String s = super.getClass().getName();
    public String getDescription(){
        return this.getClass().getName() + " " + s;
    }

}
