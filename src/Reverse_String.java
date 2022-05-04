//import java.util.Scanner;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder build = new StringBuilder();
        build.append(s);
        build.reverse();
        System.out.print(build);

        }
    }

