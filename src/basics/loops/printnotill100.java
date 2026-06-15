package basics.loops;

import java.util.Scanner;

public class printnotill100 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter<=10){
            System.out.println("hello world");
            counter++;
        }
        System.out.println("print hello world " + counter + " times");
        int num = 1;
        while (num<=10){
            System.out.println(num);
            num++;
        }
//        print number 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        while (count<=n){
            System.out.println(count);
            count++;
        }
        System.out.println("print number till " + n);
//        sum till n numbers
        int nn = sc.nextInt();
        int sum =0;
        int i=1;
        while (i<=nn){
            sum +=i;
            i++;
        }
        System.out.println(sum);
        System.out.println("sum of n numbers ");
    }
}
