import java.util.Scanner;

public class linearsearch {
    public static int search(int[] arr,int target){
        for (int i =0 ; i<=arr.length;i++){
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target key : ");
        int target = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter the elements of array");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        int index = search(arr,target);
        if (index==-1){
            System.out.println("index is not found : ");
        }else {
            System.out.println("index is found at : "+ index);
        }
        System.out.println();
    }
}
