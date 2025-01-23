package telran.lesson19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileNioExample {

    public static void main(String[] args) {
        String path = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson19";
        Path filePath = Paths.get(path, "test.txt");
        List<String> strings = null;
        try {
            strings = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(strings);
    }
}
