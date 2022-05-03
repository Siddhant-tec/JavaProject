public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    public Book(String author, String title, String genre, int numPages){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;

    }
    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getNumPages(){
        return numPages;
    }

    public void printBookDetails() {
        System.out.println(getTitle());
        System.out.println("by: " + getAuthor());
        System.out.println(getGenre() + " has " + getNumPages() + " Pages ");
        System.out.println();
    }

}

class BookDemo{
    public static void main(String[] args) {
        Book StarWars = new Book("George Lucas", "Star Wars", "Sci-Fi", 764);
        Book HarryPotter = new Book("J.K Rowling", "Harry Potter", "Adventure", 1364);
        Book TheCave = new Book("Stephen King" , "The Cave", "Horror", 456);
        StarWars.printBookDetails();
        HarryPotter.printBookDetails();
        TheCave.printBookDetails();

    }

}