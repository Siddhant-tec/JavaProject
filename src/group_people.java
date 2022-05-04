import java.util.Scanner;

public class group_people {
    public static void main(String[] args) {
        String input;
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        //s.nextLine();
        input = s.nextLine();
        char[] characters = input.toCharArray();


        int j = 0;
        while ((j < characters.length - 1)){
            System.out.print(characters[j]);
            if(characters[j+1] != characters[j]+1){
                System.out.println();
            }
            j += 1;
        }
        System.out.println(characters[characters.length - 1]);


    }

}
