public class Movie {
    String MovieName;
    String Genre;
    double Rating;

    void PlayThisMovie(){
        System.out.println(MovieName + " is Playing....");
        System.out.println(Genre);
        System.out.println(Rating + " Stars");
    }
}

class MovieTest{
    public static void main(String[] args){
        Movie one = new Movie();
        one.MovieName = "Star Wars";
        one.Genre = "Sci-Fi";
        one.Rating = 10.00;

        Movie two = new Movie();
        two.MovieName = "Veronica";
        two.Genre = "Horror";
        two.Rating = 9.10;

        Movie three = new Movie();
        three.MovieName = "The Imitation Games";
        three.Genre = "Thriller";
        three.Rating = 9.20;

        one.PlayThisMovie();

    }
}