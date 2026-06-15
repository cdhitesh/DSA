package recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        int f1 = fact(n-1);
        int f2 = n * fact(n-1);
        return f2;
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        int s1 = sum(n-1);
        int s2 = n + sum(n-1);
        return s2;
    }
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        int fab = fibonacci(n-1)+fibonacci(n-2);
        return fab;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
        System.out.println(sum(n));
        System.out.println(fibonacci(n));
    }
}
