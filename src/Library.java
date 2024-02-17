import java.util.Arrays;

public class Library {
    private int id;
    private String name;
    private Book[] booksMeaning;

    public Library(){

    }

    public Library(int id, String name, Book[] booksMeaning) {
        this.id = id;
        this.name = name;
        this.booksMeaning = booksMeaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return booksMeaning;
    }

    public void setBooks(Book[] booksMeaning) {
        this.booksMeaning = booksMeaning;
    }




    public void addBook(Book book){
        Book[] newBooks = new Book[booksMeaning.length + 1];;
        System.arraycopy(booksMeaning, 0, newBooks, 0, booksMeaning.length);




    }

    public void getAllBooks(){
        for (Book book:booksMeaning) {
            System.out.println(book);
        }
    }

    public void getByIdBook(int bookId){
        for (Book book:booksMeaning) {
            if (book.getId() == bookId){
                System.out.println(book);
            }else {
                System.out.println("Not found!");
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + Arrays.toString(booksMeaning) +
                '}';
    }
}