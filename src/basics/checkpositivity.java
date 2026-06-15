package basics;

import java.util.Scanner;

public class checkpositivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        if (num>0){
            System.out.println(num + " is a positive number ");
        } else if (num ==0) {
            System.out.println(num + " is zero");
        }
         else {
            System.out.println(num +" is a negative number ");
        }
    }
}
