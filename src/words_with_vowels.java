import java.util.*;
public class words_with_vowels {
    public static void main(String[] args) {
        String sentence;
        Scanner s = new Scanner(System.in);
        sentence = s.nextLine();
        String[] split_sentence = sentence.split(" ");
        for(String n : split_sentence){
            for(int i = 0; i < n.length(); i++){
                char j = Character.toLowerCase(n.charAt(i));
                if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u'){
                    System.out.println(n);
                    break;
                }
            }
        }
    }
}
