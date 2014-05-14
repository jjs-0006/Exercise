package jp.co.jjs.java_seminar.self_study.q1_16;

public class Exercise3 {

    public static void main(String[] args) {
        byte[][][] b = new byte[3][3][3];
        for(int i = 0 ;i < b.length;i++){
            for(int j = 0;j < b[i].length;j++){
                for(int k = 0;k < b[i][j].length;k++){
                    System.out.print(+b[i][j][j] + " ");
                }
                System.out.println();
            }
        
        }

    }

}
