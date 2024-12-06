package telran.summary_lessons.summary06122024.book_task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@ToString
@AllArgsConstructor
public class Author implements Comparable<Author> {

    private String name;

    private String surname;

    @Override
    public int compareTo(Author o) {
        int result = this.name.compareTo(o.getName());
        return result == 0 ? this.surname.compareTo(o.getSurname()) : result;
    }
}
