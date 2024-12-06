package telran.summary_lessons.summary06122024.book_task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Book {

    private String title;

    private Genre genre;

    private Author author;

    private int year;
}
