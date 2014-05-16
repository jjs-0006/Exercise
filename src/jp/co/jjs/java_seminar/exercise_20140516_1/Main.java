package jp.co.jjs.java_seminar.exercise_20140516_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Todo list = new Todo();
        Scanner sc = new Scanner(System.in);
        label:while (true) {
            list.viewList();
            System.out.println("\n1:登録(通常)   2:登録(買い物)   3:完了   0:終了      >>");
            String s = sc.next();
            String s2;
            switch (s) {
            case "1":
                System.out.println("登録する内容を入力してください>>");
                s = sc.next();
                Task task = new Task(s);
                list.setList(task);
                break;
            case "2":
                System.out.println("買うものを入力してください>>");
                s = sc.next();
                System.out.println("買うものの金額を入力してください>>");
                s2 = sc.next();
                BuyTask btask = new BuyTask(s,Integer.valueOf(s2));
                list.setList(btask);
                break;
            case "3":
                System.out.println("完了したタスクの番号を入力してください>>");
                s = sc.next();
                list.complete(Integer.valueOf(s));
                break;
            case "0":
                break label;
            default:
                System.out.println("1,2,3,0のどれかのみ有効です");
                break;
            }
        }
        sc.close();
        System.out.println("終了します");

    }

}
