package telran.summary_lessons.summary13122024;

import lombok.SneakyThrows;
import telran.summary_lessons.summary13122024.model.Product;

import java.io.BufferedReader;

public class UserController {

    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    private BufferedReader reader;

    public UserController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage,
    BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    @SneakyThrows
    public void start() {
        System.out.println("Please choose your language : ");
        languageStorage.printLanguages();
        int userLanguage = Integer.parseInt(reader.readLine());

        String language = languageStorage.getLanguage(userLanguage);
        System.out.println("Your language: " + language);

        System.out.println("Choose your product : ");
        productStorage.printProducts();
        int userProduct = Integer.parseInt(reader.readLine());

        Product product = productStorage.getProduct(userProduct);
        System.out.println("Your product: " + product.getTitle());

        String description = infoStorage.getDescription(product, language);
        System.out.println("Description: " + description);
    }
}
