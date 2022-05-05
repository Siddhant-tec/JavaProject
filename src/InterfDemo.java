import java.util.Scanner;

interface interFace{
        int a = 10;
        public void display(String name);

    }

class InterDemo implements interFace{
    public void display(String name){
        System.out.println(name);
        System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        InterDemo id  = new InterDemo();
        id.display(name);



    }
}
