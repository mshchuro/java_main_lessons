package telran.lesson18;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
public class InputOutputExample {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        //System.out - стандартный поток вывода - по дефолту в консоль
        PrintStream out = System.out;
        System.out.print("Java");

        System.out.printf("%nx = %d%n", 10);
        System.out.printf("%.3f", Math.PI);
        float x = 3456.345f;
        System.out.printf("%n%2.2f", x);
        System.out.println();
        System.out.printf("%2.2s", "Hello Java");
        System.out.println();
        Date date = new Date();
        System.out.printf("%tT", date);
        System.out.println();
        System.out.printf("%tH %tM %tS", date, date, date);

        //System.in - стандартный поток для ввода с консоли
        InputStream in = System.in;
//        FileInputStream fileInputStream = new FileInputStream("path");
//        Scanner scanner = new Scanner(fileInputStream);
//        String s = scanner.nextLine();
//        System.out.println();
//        Scanner scanner1 = new Scanner("Hello\nJava");
//        while (scanner1.hasNext()) {
//            System.out.println(scanner1.next());
//        }
        System.out.println();

//        InputStreamReader inputStreamReader = new InputStreamReader(in);
//        int read = inputStreamReader.read();
//        System.out.println((char) read);
//
//        byte[] buffer = new byte[4];
//        System.out.println(Arrays.toString(buffer));
//        int read1 = in.read(buffer);
//        System.out.println(Arrays.toString(buffer));

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String readLine = reader.readLine();
//        System.out.println(readLine);

        //System.err - поток для вывода ошибок
        System.out.println("good message");
        System.err.println("error message");
    }
}
