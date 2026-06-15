package recursion;

import java.util.Scanner;

public class powercalculate {
    public static int power(int x , int n){
        if (n==0){
            return 1;
        }
        return x * power(x,n-1);
    }
    public static int optmize(int a , int e){
        if (e==0){
            return 1;
        }
        int result = optmize(a,e/2)+ optmize(a,e/2);
//        odd part
        if (e%2!=0){
            result = a*result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exponent number : ");
        int n = sc.nextInt();
        System.out.println("Enter teh base number : ");
        int x = sc.nextInt();
        System.out.println(power(x,n));
        System.out.println(optmize(2,5));
    }
}
