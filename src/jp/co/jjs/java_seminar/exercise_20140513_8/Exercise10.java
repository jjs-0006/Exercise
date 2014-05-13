package jp.co.jjs.java_seminar.exercise_20140513_8;

public class Exercise10 {

    public static void main(String[] args) {
        for(int i = 1;i < 31;i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }

}
