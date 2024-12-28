package telran.lesson15.lesson15_summary;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

//Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.
public class SupplierTask {

    public static void main(String[] args) {
        List<String> jokes = Arrays.asList
        ("abc", "cde", "fre");

        Supplier<String> randomJoke = () -> {
            Random rnd = new Random();
            return jokes.get(rnd.nextInt(jokes.size()));
        };

        System.out.println(randomJoke.get());
    }
}
