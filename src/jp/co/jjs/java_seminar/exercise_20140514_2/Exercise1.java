package jp.co.jjs.java_seminar.exercise_20140514_2;

public class Exercise1 {

    public static void main(String[] args) {
        Student s1 = new Student("山田一",20,0);
        Student s2 = new Student("田中太郎",21,1);
        System.out.println(s1.s + " " + s1.c + " " +  s1.classNumber + " " + s1.d + " " + s1.b);
        s1.showName();
        s2.showName();
        s1.answer();
        System.out.println(s1.report());
        s1.answer();
        System.out.println(s1.report());

    }
}
