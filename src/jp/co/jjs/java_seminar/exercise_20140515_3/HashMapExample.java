package jp.co.jjs.java_seminar.exercise_20140515_3;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("a"));
        System.out.println(map.toString());
    }

}
