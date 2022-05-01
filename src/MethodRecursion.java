public class MethodRecursion {
    public static void main(String[] args) {
        CountUpto(1, 5);

    }
    public static void CountUpto(int start, int end){
        if(start <= end){
            System.out.println(start);
            CountUpto(start + 1, end);
        }
    }
}
