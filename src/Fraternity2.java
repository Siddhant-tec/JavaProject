import java.util.Scanner;

public class Fraternity2 {
    public static void main(String[] args){
        int age;
        String gender;

        Scanner s = new Scanner(System.in);
        System.out.println("age? ");
        age = s.nextInt();
        s.nextLine();
        System.out.println("gender? ");
        gender = s.nextLine();

        if(age >= 19){
            if(gender.equals("m") || gender.equals("M") || gender.equals("Male") || gender.equals("male")){
                System.out.println("Congratulations! You are qualified for Fraternity Program.");
            }
            else {
                System.out.println("Sorry! This program is only for Males to attend.");
            }


        }
        else{
            System.out.println("Sorry! You must be least 19 years of age to be eligible for this program.");
        }

    }
}
