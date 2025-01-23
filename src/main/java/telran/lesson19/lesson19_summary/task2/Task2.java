package telran.lesson19.lesson19_summary.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 2. Имеется текстовый файл. Вывести:
 * - размер файла в байтах, КБ, МБ;
 * - количество строк в файле;
 * - количество символов в файле.
 */
public class Task2 {

    public static void main(String[] args) {
        String path = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson19\\lesson19_summary\\task2\\test.txt";

        File file = new File(path);

        long bytes = file.length();
        double kb = bytes / 1024.0;
        double mb = kb / 1024.0;

        System.out.printf(bytes + " byte");
        System.out.printf("%.6f kb ", kb);
        System.out.printf("%.6f mb", mb);

        System.out.println();
        try {
            System.out.println(Files.lines(file.toPath()).count());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(Files.lines(Path.of(path)).mapToLong(String::length).sum());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
