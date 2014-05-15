package jp.co.jjs.java_seminar.self_study.q5_7;

public class Spanish {

    public static String trans(String s){
        String re = "";
        switch (s) {
        case "One":
            re = "Uno";
            break;
        case "Two":
            re = "Dos";
            break;
        case "Three":
            re = "Tres";
            break;
        case "Four":
            re = "Quatro";
            break;
        case "Five":
            re = "Cinko";
            break;
        default:
            break;
        }
        return re;
    }

}
