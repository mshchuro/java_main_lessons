package telran.lesson19.lesson19_summary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOExamples {

    public static void main(String[] args) {
//        FileWriter writer = null;
//        BufferedWriter bufferedWriter = null;
//        try{
//            writer = new FileWriter("./data.txt");
//            bufferedWriter = new BufferedWriter(writer);
//
//            bufferedWriter.write("123");
//            bufferedWriter.write("456");
//
//            bufferedWriter.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (bufferedWriter != null) {
//                    bufferedWriter.close();
//                }
//
//                if (writer != null) {
//                    writer.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        try (FileWriter writer = new FileWriter("C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson19\\lesson19_summary\\data.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer);){
             bufferedWriter.write("123");
             bufferedWriter.write("456");
        } catch (IOException e) {
             e.printStackTrace();
        }
    }
}
