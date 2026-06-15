package string;

import java.util.Scanner;

public class syntex {
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abc";
        String str2 = new String("xyz");
//        strings are immutable
//        input in string
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // this will take only one word
        System.out.println(name);
        String namee = sc.nextLine(); // this wil take full line
        System.out.println(namee);
//        length of the string
        String fullname = "tony stark";
        System.out.println(fullname.length()); // space is also count
        String firstname = "Hitesh";
        String lastname = "Tiwari";
        String fullnames = firstname+" " + lastname;
        System.out.println(fullnames);
        System.out.println(fullnames.charAt(0));
        for (char i = 0;i<fullnames.length();i++){
            System.out.print(fullnames.charAt(i));
            String name1 = "tony";
            String name2 = "tony";
            if (name1.compareTo(name2)==0){
                System.out.println("String are equal ");
            } else {
                System.out.println("string are not equal ");
            }
//            This is case sensative as well
//            if equal =0;
//            if s1<s2 = +ve value   .... suppose apple and banana now , it compare through lexicographically means one by one comparision a = 97 and b
//            = 98 so , not equal means s1<s2 , so it further not compare and print not equal
//            if s1>s2 = -ve value;

//             Taking word from the string
            String sentence = " My name is tony";
            String name3 = sentence.substring(11, sentence.length());
            System.out.println(name3);
//            if we cant pass ending index , by default it take last index as ending index
        }
    }
}