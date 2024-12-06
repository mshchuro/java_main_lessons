package telran.summary_lessons.summary06122024.book_task;

import java.util.Comparator;

public class SortByYear implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }
}
