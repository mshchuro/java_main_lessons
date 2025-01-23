package telran.lesson19.lesson19_summary.task1;

import java.io.File;
import java.util.Arrays;

/**
 * 1. Напишите программу для получения списка файлов с расширением .txt из указанной папки.
 */
public class Task1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson19\\lesson19_summary\\task1";
        File file = new File(path);

        File[] files = file.listFiles();
        Arrays.stream(files).filter(file1 -> file1.getName().endsWith(".txt")).forEach(System.out::println);
    }
}
