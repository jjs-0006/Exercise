package jp.co.jjs.java_seminar.self_study.q6_3;

public class Exercise2 {

    public static void main(String[] args) {
        Bond[] b = new Bond[6];
        b[0] = new Bond();
        b[1] = new Bond();
        b[2] = new Bond();
        b[3] = new ConvertibleBond();
        b[4] = new ConvertibleBond();
        b[5] = new ConvertibleBond();
        for(Bond bb:b){
            bb.display();
        }

    }

}
