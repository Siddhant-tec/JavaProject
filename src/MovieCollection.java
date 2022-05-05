import java.io.*;
import java.util.*;
public class MovieCollection implements Comparable<MovieCollection> {
    private double rating;
    private String name;
    private int year;

    public int compareTo(MovieCollection m ){
        return this.year - m.year;
    }

    public MovieCollection(String name, double rating, int year){
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public double getRating(){
        return rating;
    }
    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

}

class RatingsCompare implements Comparator<MovieCollection>{
    public int compare(MovieCollection m1, MovieCollection m2){
        return Double.compare(m1.getRating(), m2.getRating());
    }

    }


class MainDemo{
    public static void main(String[] args) {
        ArrayList<MovieCollection> list = new ArrayList<>();
        list.add(new MovieCollection("Force Awakens", 8.3, 2015));
        list.add(new MovieCollection("Star Wars", 8.7, 1977));
        list.add(new MovieCollection("Empire Strikes Back", 8.8, 1980));
        list.add(new MovieCollection("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);
        for (MovieCollection movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
        RatingsCompare rt = new RatingsCompare();
        Collections.sort(list, rt);

        System.out.println();
        System.out.println(" By rating");
        for (MovieCollection movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
