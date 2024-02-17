import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Создайте класс Book(id, name, price, publishedYear, authorName)
         * для представления книги и класс Library(id, name), который
         * будет содержать массив объектов Book.(id для каждого объекта
         * должен быть уникальным).Реализуйте методы в классе Library
         * для:   добавления -> public void addBook(Book book){} ,
         * поиска -> public Book getBook(int id){} ,
         * обновления -> public Book updateBook(int id, Book newBook){},
         * удаления -> public void deleteBookByName(int id){}
         * и вывод на консоль в
         * се книги библиотеки ->
         *public Book[] getAllLibraryBooks(int libraryId){}
         */

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Donald Trump");
        book1.setAuthorName("Elinor Porter");
        book1.setPrice(523);
        book1.setPublishedYear(LocalDate.of(1895,5,2));

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("How can you earn lots of money");
        book2.setAuthorName("business");
        book2.setPrice(644);
        book2.setPublishedYear(LocalDate.of(1904,2,5));

        Book [] books = {book1,book2};

        Library library = new Library();
        library.setId(1);
        library.setName("Daniyar ");
        library.setBooks(books);

        while (true){
            System.out.println("Write command: ");
            int command = new Scanner(System.in).nextInt();
            switch (command){
                case 1 -> library.getAllBooks();
                case 2 -> library.getByIdBook(2);
            }
        }

    }
}