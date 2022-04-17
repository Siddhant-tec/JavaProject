public class MaximumSubarray {
    public static void main(String[] args){
        int max_sum = Integer.MIN_VALUE;
        int[] a = {-2, 1, -4, -5, 7, -3, 6, 7, -8};

        for(int i = 0; i < a.length; i++){
            int curr_sum = 0;
            for(int j = i; j < a.length; j++){
                curr_sum += a[j];
                if(curr_sum > max_sum){
                    max_sum = curr_sum;

                }
            }

        }
        System.out.println(max_sum);
    }
}

