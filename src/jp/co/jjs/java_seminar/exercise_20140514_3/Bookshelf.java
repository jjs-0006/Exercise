package jp.co.jjs.java_seminar.exercise_20140514_3;

import java.util.ArrayList;

import jp.co.jjs.java_seminar.exercise_20140514_1.Book;

public class Bookshelf {
    Book[] shelf = new Book[10]; //
    int bookCount;
    String theme;

    public Bookshelf(String theme){
        this.theme = theme;
    }

    public void inBook(Book book){
        if(bookCount >= 10){
            System.out.println("error!");
            return;
        }
        for(int i = 0;i < 10;i++){
            if(shelf[i] == null){
                shelf[i] = book;
                System.out.println(i+1 + "番目に入りました");
                break;
            }
        }
        bookCount++;
    }

    public Book outBook(int number){
        if(shelf[number - 1] == null){
            System.out.println("すでに空です");
            return null;
        }
        Book b = shelf[number - 1];
        shelf[number - 1] = null;
        bookCount--;
        System.out.println(number + "番目から取り出しました");
        return b;
    }

    public Book outBook(String title){
        for(int i = 0;i < 10;i++){
            if(shelf[i] == null){
                continue;
            }
            if(title.equals(shelf[i].getTitle())){
                System.out.println(i+1 + "番目から取り出しました");
                return shelf[i];
            }
        }
        System.out.println("見つかりません");
        return null;
    }

    public void show(){
        for(int i = 0;i < 10;i++){
            if(shelf[i] == null){
                continue;
            }
            System.out.println(i + 1 + ":" + shelf[i].getTitle());
        }
    }

    public ArrayList<String> output(){  //1つのデータがCSV
        ArrayList<String> ar = new ArrayList<>();
        String[] s;
        for(int i = 0;i < 10;i++){
            if(shelf[i] == null){
                continue;
            }
            s = shelf[i].getinfo();
            ar.add(String.join(",", s));
        }
        return ar;

    }

}
