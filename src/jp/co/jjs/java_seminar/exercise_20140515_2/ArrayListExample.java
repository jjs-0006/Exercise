package jp.co.jjs.java_seminar.exercise_20140515_2;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("123");
        list.remove(0);
        System.out.println(list.size());
        for(String i:list){
            System.out.print(i + " ");
        }
        System.out.println(list);
    }

}
