package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookReader {
    public static ArrayList<String> bookRead(String fname){
        try(BufferedReader reader = Files.newBufferedReader(
                Paths.get(fname),
                Charset.forName("UTF-8"))){
            ArrayList<String> ar = new ArrayList<>();
            String s = null;

            while((s = reader.readLine()) != null){
                if(s.contains("ISBN")){
                    continue;
                }
                ar.add(s);
            }
            return ar;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void bookWrite(String name,ArrayList<String> ar){
        try(BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(name),
                Charset.forName("SHIFT-JIS")
                
                )){
            int i = 0;
            while(i < ar.size()){
                String s = ar.get(i);
                writer.write(i+1 + ":" + s + "\n");
                i++;
            }
            System.out.println("ファイルに出力");

        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }

}
