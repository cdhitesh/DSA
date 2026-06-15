package string;

import java.util.Scanner;

public class panlidrome {
    public static boolean check(String str){
        char n = (char) str.length();
        for (int i =0 ; i<=n/2;i++){
            if (str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));
    }
}
