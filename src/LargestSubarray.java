public class LargestSubarray {
    public static void main(String[] args){
        int msf = Integer.MIN_VALUE;
        int meh = 0;
        int right = 0;
        int left = 0;
        int[] A = {-2, -4, 1, -5, 3, 6, -2, -3, -4};
        for( int i = 0; i < A.length; i++){
            meh = meh + A[i];
            if (meh < A[i]){
                meh = A[i];
                left = i;
            }
            if (msf < meh) {
                msf = meh;
                right = i;
            }

        }
        System.out.println(msf);
        System.out.println(right + " " + left);
    }
}
