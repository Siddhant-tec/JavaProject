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

}

class BookDemo{
    public static void main(String[] args) {
        Book StarWars = new Book("George Lucas", "Star Wars", "Sci-Fi", 764);
        Book HarryPotter = new Book("J.K Rowling", "Harry Potter", "Adventure", 1364);
        Book TheCave = new Book("Stephen King" , "The Cave", "Horror", 456);
        printBookDetails(StarWars);
        printBookDetails(HarryPotter);
        printBookDetails(TheCave);

    }
    public static void printBookDetails(Book book){
        System.out.println(book.getTitle());
        System.out.println("by: " + book.getAuthor());
        System.out.println(book.getGenre() + " has " + book.getNumPages() + " Pages ");
        System.out.println();
    }
}