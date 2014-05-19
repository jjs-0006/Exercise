package jp.co.jjs.java_seminar.self_study.q8_1;

public class Exercise1 {

    public static void main(String[] args) {
        try{
            Object obj = new Integer("85");
            System.out.println("Before cast");
            Double dobj = (Double)obj;
            System.out.println("After cast");
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}
