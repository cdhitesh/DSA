package basics;

import java.util.Scanner;

public class leapyearcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year : ");
        int year = sc.nextInt();
        if (year%4==0){
            System.out.println("it is a leep year : ");
        } else{
            System.out.println("it is not a leap year : ");
        }
    }
}
