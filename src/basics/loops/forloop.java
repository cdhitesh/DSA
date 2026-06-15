package basics.loops;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i =0; i<n;i++){
            System.out.println("********");
        }
//        print reverse of any number
        int m = sc.nextInt();
        while (m > 0){
            int lastdigit = n % 10;
            System.out.println(lastdigit+" ");
            n = n/10;
        }
        System.out.println();

    }
}
