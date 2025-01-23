package telran.lesson17.Task3;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class Student {

    private int id;

    private String name;

    private Set<String> books;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addBook(String book) {
        if (books == null) {
            books = new HashSet<>();
        }
        books.add(book);
    }
}
