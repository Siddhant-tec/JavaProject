public class Minimum {
    public int getMin(int[] list, int n){
        if (n == 1){
            return list[0];

        }
        return Math.min(list[n-1], getMin(list, n-1));
    }
}

class MinimumArray{
    public static void main(String[] args){
        Minimum m = new Minimum();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = numbers.length;
        System.out.println(m.getMin(numbers, x));


    }
}