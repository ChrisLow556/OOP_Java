package aggregation;

public class Book {
    private String title;
    private int noPages;

    Book(String title,int noPages){
        this.title = title;
        this.noPages = noPages;
    }

    public void displayBookDetails(){
        System.out.println("Title: " + title + " Pages:" + noPages);
    }
}
