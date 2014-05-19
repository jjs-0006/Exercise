package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.util.ArrayList;

import jp.co.jjs.java_seminar.exercise_20140514_1.Book;
import jp.co.jjs.java_seminar.exercise_20140514_3.Bookshelf;

public class Exercise1 {

    public static void main(String[] args) {
        ArrayList<String> ar = BookReader.bookRead("Book1.csv");
        Bookshelf shelf = new Bookshelf("rank");
        int i = 0;
        String s;
        while(i < ar.size()){
            s = ar.get(i);
            String[] sp = s.split(",");
            shelf.inBook(new Book(sp[0],sp[1],sp[2],sp[3],Integer.parseInt(sp[4])));
            i++;
        }
        shelf.show();
        ArrayList<String> out = shelf.output();
        BookReader.bookWrite("output.csv", out);


    }

}
