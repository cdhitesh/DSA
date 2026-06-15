package string;

import java.util.Scanner;

public class panindromecheck {
    public static boolean check(String str){
        char n = (char)str.length();
        for (int i =0 ; i<n/2;i++){
            if (str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(check(str));
    }
}
