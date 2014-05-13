package jp.co.jjs.java_seminar.exercise_20140513_6;

public class Exercise8_2 {

    public static void main(String[] args) {
        String s = "土";
        System.out.print("今日は" + s + "曜日です。");
        if(s.equals("日")){
            System.out.println("また休みが終わる");
        }
        else if(s.equals("月")){
            System.out.println("朝がつらい");
        }
        else if(s.equals("火")){
            System.out.println("週末までまだ4日ある");
        }
        else if(s.equals("水")){
            System.out.println("やっと折り返し");
        }
        else if(s.equals("木")){
            System.out.println("早く金曜日になってほしい");
        }
        else if(s.equals("金")){
            System.out.println("さぁ今日が終われば休みだ");
        }
        else if(s.equals("土")){
            System.out.println("気兼ねなく遊べる");
        }
    }

}
