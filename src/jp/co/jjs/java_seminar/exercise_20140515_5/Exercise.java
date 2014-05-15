package jp.co.jjs.java_seminar.exercise_20140515_5;

import java.io.IOException;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) throws IOException {
        Todo list = new Todo();
        Scanner sc = new Scanner(System.in);
        label:while (true) {
            list.viewList();
            System.out.println("\n1:登録   2:完了   0:終了      >>");
            String s = sc.next();
            switch (s) {
            case "1":
                System.out.println("登録する内容を入力してください>>");
                s = sc.next();
                list.setList(s);
                break;
            case "2":
                System.out.println("完了したタスクの番号を入力してください>>");
                s = sc.next();
                list.complete(Integer.valueOf(s));
                break;
            case "0":
                break label;
            default:
                System.out.println("1,2,0のどれかのみ有効です");
                break;
            }
        }
        sc.close();
        System.out.println("終了します");

    }

}
