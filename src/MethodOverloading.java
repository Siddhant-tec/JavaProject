public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(3));
        System.out.println(getResult(4, 15));
        System.out.println(getResult(6, "76"));
        System.out.println(getResult("Method", "Overloaded"));

    }
    public static int getResult(int num){
        return num*2;
    }
    public static int getResult(int num, String s){
        return num + Integer.parseInt(s);
    }
    public static int getResult(int num, int num2){
        return num * num2;
    }
    public static String getResult(String s, String s2){
        return s + " " + s2;
    }
}
