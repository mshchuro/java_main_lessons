package FirstProjectTranslator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class CustomFileWriter {

    private static final String PATH = "C:\\Users\\mshch\\Desktop\\java_main_course\\Java_study\\src\\main\\java\\FirstProjectTranslator";

    public void writeDictionary(Language language, Map<String, String> newWordMap) {
        StringBuilder stringBuilder = new StringBuilder();

        newWordMap.forEach((k, v) -> {
            stringBuilder.append("\n" + k + ":" + v);
        });

        try {
            Files.write(Path.of(PATH, language.getFileName()), stringBuilder.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.err.println("Path is incorrect ");
            } else {
                System.out.println(e.getMessage());
            }
        }
    }
}
