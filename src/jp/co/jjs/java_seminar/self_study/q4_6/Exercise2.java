package jp.co.jjs.java_seminar.self_study.q4_6;

public class Exercise2 {

    public static void main(String[] args) {
        int i = 0;
        while(true){
            if(i > 10){
                break;
            }
            System.out.println(i * i);
            i++;
        }
        System.out.println();
        i = 1;
        do{
            System.out.println(Math.sqrt(i));
            System.out.println(" ___");
            System.out.println("(___)<|");
            i++;
        }while(i < 20);

    }

}
