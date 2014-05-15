package jp.co.jjs.java_seminar.exercise_20140515_5;

import java.util.HashMap;

public class TodoHash {
    HashMap<Integer,Task> map = new HashMap<>();
    public void setmap(String note){
        map.put(map.size(), new Task(note));
    }
    public void complete(int number){
        if(number > map.size()){
            System.out.println("無効な番号です");
            return;
        }
        map.get(number).setNote(map.get(number).getNote() + "  DONE");;

    }
    public void viewList(){
        for(int i = 0;i < map.size();i++){
            System.out.println(i + ":" + map.get(i).getNote());
        }
    }
}
