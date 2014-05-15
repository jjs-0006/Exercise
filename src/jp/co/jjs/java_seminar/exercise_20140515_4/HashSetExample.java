package jp.co.jjs.java_seminar.exercise_20140515_4;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("abc");
        set.add("123");
        set.add("bef");
        set.add("abc");
        set.remove("123");
        System.out.println(set);
        

    }

}
