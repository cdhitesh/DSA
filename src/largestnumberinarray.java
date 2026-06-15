import java.util.Scanner;

public class largestnumberinarray {
    public static int largestnumber(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i =0 ; i<= arr.length;i++){
            if (max<arr[i]){
                 max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int arr[] = new int[5];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        System.out.println("largest number is : "+ largestnumber(arr));
    }
}
