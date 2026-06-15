public class pairingofarray {
    public static void pair(int[] arr){
        int n = arr.length;
        for (int i =0 ; i<n;i++){
            int curr = arr[i];
            for (int j =i+1;j<n;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,3,7,9};
        pair(arr);
    }
}
