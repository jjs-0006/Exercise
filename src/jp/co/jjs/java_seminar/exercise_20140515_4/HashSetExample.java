package jp.co.jjs.java_seminar.exercise_20140515_4;

import java.util.HashSet;

import jp.co.jjs.java_seminar.exercise_20140514_1.Book;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<Book> setBook = new HashSet<>();
        set.add("abc");
        set.add("123");
        set.add("bef");
        set.add("abc");
        set.remove("123");
        System.out.println(set);
        Book b1 = new Book("a");
        Book b2 = new Book("a");
        setBook.add(b1);
        setBook.add(b2);
        
        System.out.println(setBook);

    }

}
