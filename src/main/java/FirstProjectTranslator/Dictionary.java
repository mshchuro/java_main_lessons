package FirstProjectTranslator;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private final CustomFileWriter customFileWriter;

    private final CustomFileReader customFileReader;

    public Dictionary(CustomFileWriter customFileWriter, CustomFileReader customFileReader) {
        this.customFileWriter = customFileWriter;
        this.customFileReader = customFileReader;
    }

    public void update(String originalWord, String translatedWord, Language language) {
        Map<String, String> map = new HashMap<>();
        map.put(originalWord, translatedWord);
        customFileWriter.writeDictionary(language, map);
    }

    public String getTranslate(Language language, String originalWord) {
        Map<String, String> map = customFileReader.readDictionary(language);
        return map.getOrDefault(originalWord, originalWord);
    }
}
