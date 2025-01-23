package telran.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * try {
 *     Здесь пишем код, который патенциально может выкинуть исключение
 * } catch(Exception e) {
 *     Здесь пишем код для обработки возникшей оишбки
 * } finally {
 *     Пишем код, который должен быть выполнен в любом случае,
 *     вне зависимости от того, что было выше (ошибки или все нормально)
 * }
 *
 * try - catch
 * try - catch - catch ... catch
 * try - finally
 * try - catch - finally
 *
 */
public class TryCatchExample {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\telran\\lesson19\\test.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new CustomFileInputStream(path);
            throw new FileNotFoundException();
        } catch (IOException e) {
            System.out.println("File with path " + path + " not found " + e.getMessage());
            //throw new RuntimeException();
            //System.exit(0);
        } finally {
            fileInputStream.close();
            System.out.println("End of program");
        }
    }
}
