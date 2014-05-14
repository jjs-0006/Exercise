package jp.co.jjs.java_seminar.exercise_20140514_1;

public class Book {
    int isbn;
    int price;
    int group;
    String title;
    String publisher;
    String author;

    int lendCount;
    boolean lendState;
    public void lendBook(){
        lendState = true;
        lendCount++;
    }
    public void returnBook(){
        lendState = false;
    }


}
