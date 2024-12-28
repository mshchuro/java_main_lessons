package telran.summary_lessons.summary13122024;

import lombok.SneakyThrows;
import telran.summary_lessons.summary13122024.model.Product;

import java.io.BufferedReader;

public class AdminController {
    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    private BufferedReader reader;

    public AdminController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage,
                           BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    @SneakyThrows
    public void start() {
        System.out.println("Choose language: ");
        languageStorage.printLanguages();
        String data = reader.readLine();

        String language = languageStorage.getLanguage(Integer.parseInt(data));

        System.out.println("Input product title: ");
        String title = reader.readLine();

        Product product = productStorage.getOrCreate(title);
        System.out.println("" + product.getTitle() + " - " + product.getId());

        System.out.println("Input your description: ");
        String description = reader.readLine();

        infoStorage.addDescription(product, language, description);
    }
}
