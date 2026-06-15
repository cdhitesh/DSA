package basics;
import java.util.*;

public class conditionalque {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        if (a>b){
            System.out.println("a is greater then b");
        }else {
            System.out.println("b is greater then a ");
        }
        //    given number is even or odd
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("it is an even number");
        }
        else{
            System.out.println("it is an odd number");
        }
    }
}
