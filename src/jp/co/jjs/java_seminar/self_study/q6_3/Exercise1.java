package jp.co.jjs.java_seminar.self_study.q6_3;

class A3{
    void hello(){
        System.out.println("Hello from A3");
    }
    void hello(int i){
        System.out.println("Hello from A3 " + i);
    }
}

class B3 extends A3{
    void hello(){
        System.out.println("Hello from B3");
    }
}

class C3 extends B3{
    void hello(String s){
        System.out.println("Hello from C3 " + s);
        
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        A3 obj = new C3();
        obj.hello();

    }

}


//このプログラムを実行すると、 "Hello from B3"　と出力される