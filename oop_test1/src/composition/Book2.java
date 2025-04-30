package composition;

public class Book2 {
    private String title;
    private int noPages;

    Book2(String title,int noPages){
        this.title = title;
        this.noPages = noPages;
    }

    public void displayBookDetails(){
        System.out.println("Title: " + title + " Pages:" + noPages);
    }
}
