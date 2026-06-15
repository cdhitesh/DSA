public class maxsubarray {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        int current = 0;
        int maxsum = Integer.MIN_VALUE; // minus infinity.
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // Use j < n here
                for (int k = i; k <= j; k++) {
                  current += arr[k];
                }
                System.out.println(current);
                if (maxsum<current){
                    maxsum= current;
                }
            }
        }
        System.out.print("max value = " + maxsum);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printSubarrays(arr);
    }
}

