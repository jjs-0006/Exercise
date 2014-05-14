package jp.co.jjs.java_seminar.self_study.q4_6;

public class Exercise1 {

    public static void main(String[] args) {
        int i = 0;
        while(i < args.length){
            System.out.println(args[i]);
            if(!args[i].substring(0).equals(args[i].toUpperCase())){
                System.out.println("error");
                break;
            }
            i++;
        }
    }

}
