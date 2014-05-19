package jp.co.jjs.java_seminar.exercise_20140514_1;
/**
 *
 * @author student
 *
 */
public class Book {
    String isbn;
    int price;
    int group;
    String title;
    String publisher;
    String author;
    int lendCount;
    boolean lendState;

    public Book(String title,String isbn,String author,String publisher,int price) {
        // TODO 自動生成されたコンストラクター・スタブ
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String[] getinfo(){
        String[] s = {this.title,this.isbn,this.author,this.publisher,String.valueOf(this.price)};
        return s;
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
