package jp.co.jjs.java_seminar.self_study.q4_4;

public class Exercise1 {

    public static void main(String[] args) {
        int i = 0;
        int n1 = 1,n2 = 1;
        System.out.println(n1);
        i++;
        System.out.println(n2);
        i++;
        do{
            int temp = n1 + n2;
            System.out.println(temp);
            i++;
            n1 = n2;
            n2 = temp;
        }while(i < 15);
    }

}
