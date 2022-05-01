import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args){
        int age;
        char gender;

        Scanner s = new Scanner(System.in);
        System.out.println("age? ");
        age = s.nextInt();
        System.out.println("gender? ");
        gender = s.next().charAt(0);

        if(age >= 19 && gender == 'm'){
            System.out.println("Congratulations! You are qualified for Fraternity Program.");

        }
        else{
            System.out.println("Sorry! This program is only for Males to attend.");
        }

    }
}
