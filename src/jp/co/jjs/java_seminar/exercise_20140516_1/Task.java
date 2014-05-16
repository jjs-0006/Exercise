package jp.co.jjs.java_seminar.exercise_20140516_1;

public class Task {
    private String note;
    private boolean done;
    public Task(String note){
        this.note = note;
    }
    public String getNote(){
        return note;
    }

    public boolean done(){
        return done;
    }

    public void complete(){
        done = true;
    }

    public void setNote(String note){
        this.note = note;
    }
}
