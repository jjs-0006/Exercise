package jp.co.jjs.java_seminar.exercise_20140514_2;

public class Student {
    String name;
    int age;
    int id;
    int classNumber;
    int answerCount;
    String s;
    char c;
    double d;
    boolean b;

    public Student(String name,int age,int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void showName(){
        System.out.println("氏名:" + name + "\n年齢:" + age + "歳\nID:" + id);
    }

    public void answer(){
        answerCount++;
        System.out.println(answerCount + "問解いた");
    }

}