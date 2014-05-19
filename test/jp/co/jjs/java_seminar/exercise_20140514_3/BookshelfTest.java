package jp.co.jjs.java_seminar.exercise_20140514_3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import jp.co.jjs.java_seminar.exercise_20140514_1.Book;

import org.junit.Before;
import org.junit.Test;

public class BookshelfTest {
    Bookshelf shelf;

    @Before
    public void setUp() {
        shelf = new Bookshelf("a");
        shelf.inBook(new Book("a1", "1", "a1", "a1", 1));
        shelf.inBook(new Book("a2", "2", "a2", "a2", 2));
        shelf.inBook(new Book("a3", "3", "a3", "a3", 3));
    }

    @Test
    public void getAllメソッド実行時に追加したBookがすべて帰ってくる() {

        Book[] actual = shelf.getAll();
        Book[] expected = { new Book("a1", "1", "a1", "a1", 1) ,
                new Book("a2", "2", "a2", "a2", 2),
                new Book("a3", "3", "a3", "a3", 3)};
        assertThat(actual[0].getinfo(), is(expected[0].getinfo()));
        assertThat(actual[1].getinfo(), is(expected[1].getinfo()));
        assertThat(actual[2].getinfo(), is(expected[2].getinfo()));

    }

    @Test
    public void getAllメソッド実行時に追加したBookの件数分のオブジェクトが返ってくる() {
        Book[] actual = shelf.getAll();
        assertThat(actual.length, is(10));
    }

}
