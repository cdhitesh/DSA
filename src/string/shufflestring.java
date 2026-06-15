package string;

import java.util.Arrays;
import java.util.Scanner;

public class shufflestring {
    public static boolean valid(String s1,String s2, String res){
        int n = s1.length();
        int m = s2.length();

        s1 = sort(s1);
        s2 = sort(s2);
        res = sort(res);
        if (n+m!=res.length()){
            return false;
        }
        int i =0 ; int j =0 ; int k = 0 ;
        while (k<res.length()){
            if (i<n && s1.charAt(i)==res.charAt(k)){
                i++; k++;
            } else if (j<m && s2.charAt(j)== res.charAt(k)) {
                j++; k++;
            } else {
                return false;
            }
        }
        return true;
    }
    public static String sort(String str){
        char [] cha = str.toCharArray();
        Arrays.sort(cha);
        return String.valueOf(cha);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String res = sc.next();
        System.out.println(valid(s1,s2,res));
    }
}

