import java.util.Scanner;

public class Proj2_1_AverageofThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.println("Enter the number");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            double average;
            average = (a + b + c)/3;
            System.out.println(average);


        }
    }

