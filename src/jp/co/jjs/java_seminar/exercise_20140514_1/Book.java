package jp.co.jjs.java_seminar.exercise_20140514_1;
/**
 *
 * @author student
 *
 */
public class Book {
    int isbn;
    int price;
    int group;
    String title;
    String publisher;
    String author;
    int lendCount;
    boolean lendState;

    public Book(String title) {
        // TODO 自動生成されたコンストラクター・スタブ
        this.title = title;
    }

    public void lendBook(){
        lendState = true;
        lendCount++;
    }

    public void returnBook(){
        lendState = false;
    }
    
    public String getTitle(){
        return title;
    }

}
