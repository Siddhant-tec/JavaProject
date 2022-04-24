import java.util.ArrayList;

public class Eggs {
    public static void main(String[] args){


        ArrayList<String> myList = new ArrayList<String>();
        String s = new String("Whooo");
        myList.add(s);

        String b = new String("Frog");
        myList.add(b);

        int ListSize = myList.size();
        Object o = myList.get(1);
        Object t = myList.get(0);

        System.out.println(ListSize);
        System.out.println(myList);
        System.out.println(o);
        System.out.println(t);

        myList.remove(o);
        System.out.println(myList);
        System.out.println(myList.getClass());

        Integer x = 1534236469;
        String y = Integer.toString(x);
        System.out.println(x);
        System.out.println(y.getClass());
        StringBuilder build = new StringBuilder();
        build.append(y);
        build.reverse();
        System.out.println(build);

        String str = build.toString();
        //Integer z = Integer.valueOf(str);
        System.out.println('-' + str.substring(0,str.length()-1));
        //int[] numbers = new int[6];
        //int[] cell = {4, 5, 6};
        //numbers = cell;
        //System.out.println(z);
        //System.out.println(y.charAt(2));



    }
}
