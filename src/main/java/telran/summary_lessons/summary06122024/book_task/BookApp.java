package telran.summary_lessons.summary06122024.book_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Author author1 = new Author("Max", "Shchurovskiy");
        Author author2 = new Author("Max", "Dogoda");
        Author author3 = new Author("Irina", "Krug");

        List<Book> books = new ArrayList<>();
        books.add(new Book("Title One", Genre.NOVEL, author1, 1999));
        books.add(new Book("Title Two", Genre.FICTION, author2, 2020));
        books.add(new Book("Title Four", Genre.NON_FICTION, author1, 2001));
        books.add(new Book("Title Five", Genre.NOVEL, author3, 2011));
        books.add(new Book("Title Three", Genre.FICTION,author2, 1993));

        while (true) {
            System.out.println("Type a number: ");
            System.out.println("0 -> Exit: ");
            System.out.println("1 -> Author: ");
            System.out.println("2 -> Title: ");
            System.out.println("3 -> Year: ");
            System.out.println("4 -> Genre: ");
            System.out.println("5 -> Category");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice){
                case 1 ->  books.sort(new SortByAuthor());
                case 2 -> books.sort(new SortByTitle());
                case 3 -> books.sort(new SortByYear().reversed());
                case 4 -> books.sort(new SortByGenre());
                case 5 -> books.sort(new SortByCategory());
            }
            books.forEach(System.out::println);
        }
    }
}
