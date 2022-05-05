import java.util.Scanner;

interface Case{
    public String move(String str);
}

public class uppercaseToEnd implements Case {
    public String move(String str){
        StringBuilder answer = new StringBuilder();
        StringBuilder answer2 = new StringBuilder();
        String small = "";
        String capital = "";
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                answer.append(c);
            }
            if(Character.isLowerCase(c)){
                answer2.append(c);
            }
            capital = answer.toString();
            small = answer2.toString();

        }
        return small + capital;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        uppercaseToEnd ue = new uppercaseToEnd();
        System.out.println(ue.move(input));
    }

}
