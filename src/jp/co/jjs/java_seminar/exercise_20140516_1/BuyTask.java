package jp.co.jjs.java_seminar.exercise_20140516_1;

public class BuyTask extends Task {
    private int price;

    public BuyTask(String note,int price) {
        super(note);
        this.price = price;
        // TODO 自動生成されたコンストラクター・スタブ
    }

    @Override
    public String getNote() {
        // TODO 自動生成されたメソッド・スタブ
        return super.getNote() + "  " + price + "円";
    }

    public void setNote(String note,int price) {
        // TODO 自動生成されたメソッド・スタブ
        super.setNote(note);
        this.price = price;
    }







}
