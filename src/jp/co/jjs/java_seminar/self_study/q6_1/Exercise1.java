package jp.co.jjs.java_seminar.self_study.q6_1;

class Parent{

}

class Child extends Parent{

}

public class Exercise1 {
    public static void main(String[] args) {
        Parent p;
        p = new Parent();
        p = new Child();
        Child c;
        c = new Child();
//        c = new Parent();
    }

}

//親クラスとサブクラスの関係は、サブクラス is a 親クラス　となる
//18行目では、ParentクラスのインスタンスをChildクラスに代入している。
//Childクラス is a Parentクラスではあるが、Parentクラス is a Childクラスではないので
//エラーとなる