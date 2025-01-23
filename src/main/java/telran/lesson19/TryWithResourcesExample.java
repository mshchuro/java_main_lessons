package telran.lesson19;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        String path = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson19\\test.txt";
        try (FileInputStream fileInputStream = new CustomFileInputStream(path)){
            int read = fileInputStream.read();
        } catch (IOException exception) {
            System.out.println("Read exception" + exception.getMessage());
        }

        try(FunnyStream funnyStream = new FunnyStream()) {

        } catch (Exception e) {

        }
    }
}
