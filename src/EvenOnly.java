public class EvenOnly {
    public static void main(String[] args){
        int i = 10;
        while (i > 0){
            if (i % 2 != 0){
                i -= 1;
                continue;

            }
            System.out.println(i);
            i -= 1;
        }

    }
}
