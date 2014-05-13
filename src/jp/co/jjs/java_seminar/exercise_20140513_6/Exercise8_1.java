package jp.co.jjs.java_seminar.exercise_20140513_6;

public class Exercise8_1 {

    public static void main(String[] args) {
        String s = "土";
        System.out.print("今日は" + s + "曜日です。");
        switch (s) {
        case "日":
            System.out.println("また休みが終わる");
            break;
        case "月":
            System.out.println("朝がつらい");
            break;
        case "火":
            System.out.println("週末までまだ4日ある");
            break;
        case "水":
            System.out.println("やっと折り返し");
            break;
        case "木":
            System.out.println("早く金曜日になってほしい");
            break;
        case "金":
            System.out.println("さぁ今日が終われば休みだ");
            break;
        case "土":
            System.out.println("気兼ねなく遊べる");
            break;
        default:
            break;
        }
    }

}
