package aggregation;

public class Library {
    private String name;
    private Book [] bookList = new Book[10];

    Library(String name,Book [] bookList){
        this.name = name;
        this.bookList = bookList;
    }

    public void displayLibraryBooks(){
        System.out.println("The Library " + name + " contains these books:");
        for(Book book : bookList){
            book.displayBookDetails();
        }
    }

}
