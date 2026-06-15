package basics;
import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//        String number = sc.next();
//        System.out.println(number);
////        if we use this we also get input but it only count single word from teh para thaswhy we use nextInt to print full para and only use in string
//        String st =  sc.nextLine();
//       System.out.println(st);
//       float fll = sc.nextFloat();
//        System.out.println(fll);
//        sum of two numbers by taking an input from teh user
//        System.out.println("enter a number : ");
//        int a = sc.nextInt();
//        System.out.println("enter 2nd number : ");
//        int b = sc.nextInt();
//        System.out.println("sum of two numbers");
//        int sum = a+b;
//        System.out.println(sum);
//        area of circle
        double pi= 3.14;
        System.out.println("enter the radius of a circle : ");
        double radius = sc.nextDouble();
        System.out.println("arae of circle : ");
        double area = pi*radius*radius;
        System.out.println(area);

    }
}
