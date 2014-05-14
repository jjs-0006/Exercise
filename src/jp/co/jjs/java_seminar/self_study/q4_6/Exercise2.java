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
            i++;
        }while(i < 20);
        System.out.println();
        for(int j = 0;j < 10;j++){
            System.out.println(Math.log(j));
        }
        System.out.println();
        label:for(i = 0;i < 10;i++){
            for(int j = 0;j < 10;j++){
                if(i*j > 50){
                    break label;
                }
                if(i*j < 10){
                    System.out.print(" ");
                }
                System.out.print(i*j);

            }
            System.out.println();
        }

    }

}
