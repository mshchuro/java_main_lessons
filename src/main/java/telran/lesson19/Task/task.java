package telran.lesson19.Task;

import java.io.FileWriter;
import java.io.IOException;

public class task {

    public static void main(String[] args) {
        String string = "Some words arr";
        String[] words = string.split(" ");
        String absolutePath = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson19\\Task";

        for (int i = 0; i < words.length; i++) {
            String path = absolutePath + "\\" + words[i] + ".txt";
            try (FileWriter fileWriter = new FileWriter(path)){
                fileWriter.write(words[i]);
                fileWriter.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
