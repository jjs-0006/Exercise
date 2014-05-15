package jp.co.jjs.java_seminar.exercise_20140515_5;

import java.util.ArrayList;

public class Todo {
    ArrayList<Task> list = new ArrayList<>();

    public void setList(String note){
        list.add(new Task(note));
    }

    public void complete(int number){
        if(number > list.size()){
            System.out.println("無効な番号です");
            return;
        }
        list.get(number -1).setNote(list.get(number -1).getNote() + "   DONE");
    }

    public void viewList(){
        for(int i = 0;i < list.size();i++){
            System.out.println((i + 1) + ":" + list.get(i).getNote());
        }
    }

}
