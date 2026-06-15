package basics;

import java.util.Scanner;

public class twodarray {
    public static boolean search(int[][] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key you wnat to find : ");
        int key = sc.nextInt();
        for (int i =0 ; i< arr.length;i++){
            for (int j =0 ; j< arr[0].length;j++){
                if (arr[i][j]==key){
                    System.out.println("key present on the index "+"(" + i + ")" + "(" + j +")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i<n;i++){
            for(int j =0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i =0 ; i<n ; i++){
            for (int j =0 ; j<m ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(search(arr));;
    }
}
