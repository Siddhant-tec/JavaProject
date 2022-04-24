import java.util.Random;
public class RandomFun {
    public static void main(String[] args){
        Random random = new Random();
        int myRandom = random.nextInt();
        System.out.println(myRandom);

        myRandom = random.nextInt(100);
        System.out.println(myRandom);

        myRandom = random.nextInt(100) + 1;
        System.out.println(myRandom);
    }
}
