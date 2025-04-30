package aggregation;

public class Library {
    private String name;
    private Book [] bookList = {
        new Book("Lord of the rings", 200),
        new Book("Your mum", 150),
        new Book("Ur dad", 170)
    };

    Library(String name){
        this.name = name;
    }

    public void displayLibraryBooks(){
        System.out.println("The Library " + name + " contains these books:");
        for(Book book : bookList){
            book.displayBookDetails();
        }
    }

}
