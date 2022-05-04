import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class increasing_word_length {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //StringBuilder sb = new StringBuilder();
        String sentence = s.nextLine();
        String[] split_sentence = sentence.split(" ");
        Arrays.sort(split_sentence, Comparator.comparingInt(String::length));

        for(String n : split_sentence){
            System.out.println(n);
        }


    }
}
