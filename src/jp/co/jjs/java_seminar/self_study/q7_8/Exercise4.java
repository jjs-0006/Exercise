package jp.co.jjs.java_seminar.self_study.q7_8;

import jp.co.jjs.java_seminar.self_study.q7_8.f.F;
import jp.co.jjs.java_seminar.self_study.q7_8.g.G;

public class Exercise4 {

    public static void main(String[] args) {
        F f = new F();
        f.display();
        G g = new G();
        g.display();

    }

}
//f\F.javaおよびg\G.javaからコメント文字を削除した場合、その行で
//不可視のフィールドにアクセスしているためコンパイルエラーが発生する。