package jp.co.jjs.java_seminar.exercise_20140516_1;

import java.util.ArrayList;

public class Todo {
    ArrayList<Task> list = new ArrayList<>();

    public void setList(Task task){
        list.add(task);

    }

    public void complete(int number){
        if(number > list.size()){
            System.out.println("無効な番号です");
            return;
        }
        list.get(number -1).complete();
    }

    public void viewList(){
        for(int i = 0;i < list.size();i++){
            String s = list.get(i).done() ? "  DONE" : "";
            System.out.println((i + 1) + ":" + list.get(i).getNote() + s);
        }
    }
}
