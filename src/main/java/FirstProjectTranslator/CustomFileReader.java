package FirstProjectTranslator;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomFileReader {

    private static final String PATH = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\FirstProjectTranslator";

    public Map<String, String> readDictionary (Language language) {
        String path = PATH + File.separator + language.getFileName();
        Map<String, String> dictionary = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
            while (reader.ready()) {
                String[] split = reader.readLine().split(":");
                dictionary.put(split[0].trim(), split[1].trim());
            }

        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.err.println("File not found " + path);
            } else {
                System.out.println(e.getMessage());
            }
        }
        return dictionary;
    }
}
