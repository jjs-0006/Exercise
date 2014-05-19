package jp.co.jjs.java_seminar.self_study.q6_4;

public class J2 extends I2 {
    I2 i = new I2();
    String s = i.getClass().getName();
    public String getDescription(){
        return this.getClass().getName() + " " + s;
    }

}
