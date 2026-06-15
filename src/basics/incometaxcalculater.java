package basics;
import java.util.*;

public class incometaxcalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        int income = sc.nextInt();
        int tax;;
        if (income <= 500000){
            tax = 0;
            System.out.println("no tax");
        }
         if (income <= 500000 && income >= 100000){
             tax = (int) (income*0.2);
         }
        else {
             tax = (int) (income * 0.3);
           System.out.println("you have to pay tak of 35% of ypur total income ");
            System.out.println("your tax is : "+ tax);
        }
    }
}
