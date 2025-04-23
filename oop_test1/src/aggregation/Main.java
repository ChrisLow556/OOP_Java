package aggregation;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Seven Angry Sons", 100);
        Book book2 = new Book("The Top Gunners", 250);
        Book book3 = new Book("Ten Thousand Years", 122);

        Book[] bookList = {book1, book2, book3};

        Library library = new Library("The Library of Alexandria", bookList);
        library.displayLibraryBooks();
    }
}
