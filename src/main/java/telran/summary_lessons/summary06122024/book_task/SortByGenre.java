package telran.summary_lessons.summary06122024.book_task;

import telran.lesson5.lesson5_summary.Genre;

import java.util.Comparator;

public class SortByGenre implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getGenre().name().compareTo(o2.getGenre().name());
    }
}
