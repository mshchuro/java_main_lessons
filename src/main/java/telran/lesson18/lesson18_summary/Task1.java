package telran.lesson18.lesson18_summary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/**
 * 1. Реализовать логирование стектрейса Exception со временем ошибки в файл errors.log
 */
public class Task1 {

    public static void main(String[] args) throws Exception {
        String file = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson18\\lesson18_summary\\errors.log";
        try {
            System.out.println(1 / 0);
        } catch (Exception error) {
            FileWriter fileWriter = new FileWriter(file, true);
            Date date = new Date();
            fileWriter.write(Arrays.toString(error.getStackTrace()) + date + "\n");
            fileWriter.close();
        }
    }
}
