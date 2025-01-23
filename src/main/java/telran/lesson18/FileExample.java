package telran.lesson18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * InputStream - для чтения набора байт
 * OutputStream - для записи набора байт
 *
 * Reader - для чтения символов
 * Writer - для записи символов
 *
 * FileInputStream
 * FileOutputStream
 * FileReader
 * FileWriter
 *
 * InputStreamReader - конвертирует байты в символы
 * OutputStreamWriter -
 */
public class FileExample {

    public static void main(String[] args) throws Exception {
        //InputStream - read, available
        //OutputStream - write

        String path = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson18\\text.txt";
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(path);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            sb.append((char) data);
        }
        System.out.println(sb);

        String pathOut = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson18\\text2.txt";
        String example = "Java Java";
        FileOutputStream fileOutputStream = new FileOutputStream(pathOut);
        for (int i = 0; i < example.length(); i++) {
            char temp = example.charAt(i);
            fileOutputStream.write(temp);
        }
        fileOutputStream.close();
    }
}
