package pattern;

public class KadanesAlgorithms {
    public static int maxSubArray(int[] arr) {

        int csum = arr[0];
        int osum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (csum > 0) {

                csum = csum + arr[i];
            } else {
                csum = arr[i];
            }
            if (csum > osum) {
                osum = csum;
            }


        }
        return osum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }


}
