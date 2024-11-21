package telran.lesson5.lesson5_summary;

//Librarian - name, department, books(limit = 10)
//Библиотекарь может выдать книгу пользователю
//Можно посмотреть какие книги есть(полный список)

public abstract class Librarian implements Printer {

    private static final int BOOK_LIMIT = 10;

    private String name;

    private final Book[] books = new Book[BOOK_LIMIT]; //10 magic number!

    private Department department;

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void giveBook(String isbn, Reader reader) {
        //Books[] userBooks = reader.getbook();
        //Найти по isbn книгу из массива книг этого библиотекаря в цикле
        //и присвоить найденную книгу в массив книг пользователя
    }

    @Override
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public Book[] getBooks() {
        return books;
    }
}
