package Backtracking.java;

public class onarrays {
    public static void changetarray(int[] arr,int i , int val ){
        int n = arr.length;
        if (i==n){
            printarray(arr);
            return;
        }
//        recursion
        arr[i] = val;
        changetarray(arr,i+1,val+1);
//        backtracking
        arr[i] = arr[i] - 2;
    }
    public static void printarray(int[] arr){
        for (int i =0 ; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        changetarray(arr,0,1);
        printarray(arr);
    }
}
