import java.util.List;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.addBook("Book One", "Author A", 2020);
            library.addBook("Book Two", "Author B", 2021);
            library.addBook("Book Three", "Author A", 2022);
        } catch (DuplicateBookException | InvalidYearException e) {
            System.out.println(e.getMessage());
        }

        try {
            library.removeBook("Автор B", "Вторая Книга");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }

        List<Book> booksByAuthor = library.findBooksByAuthor("Автор A");
        for (Book book : booksByAuthor) {
            System.out.println("Найдена книга автора A: " + book.getTitle());
        }

        List<Book> booksByYear = library.findBooksByYear(2022);
        for (Book book : booksByYear) {
            System.out.println("Книга найдена создана в 2022: " + book.getTitle());
        }
    }
}
