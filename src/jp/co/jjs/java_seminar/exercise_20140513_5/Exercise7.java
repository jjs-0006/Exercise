package jp.co.jjs.java_seminar.exercise_20140513_5;

public class Exercise7 {

    public static void main(String[] args) {
        int n = 20;
        if(n % 4 == 0 && n % 5 == 0){
            System.out.println("20の倍数です");
        }
        else if(n % 5 == 0){
            System.out.println("5の倍数です");
        }
        else if(n % 4 == 0){
            System.out.println("4の倍数です");
        }
    }
}
