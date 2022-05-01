import java.util.Scanner;

public class MethodsDemo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double number = s.nextDouble();
        System.out.println(Squared(number));

    }
    public static double Squared(double x){
        return(x*x);
    }
}
