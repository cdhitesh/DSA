public class binarysearch {
    public static int search(int[] arr,int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {//check for right side
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,9};
        int target = 2;
        System.out.println("Key is present at index : "+ search(arr,target));
    }
}
