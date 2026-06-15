import java.util.Scanner;

public class productoftwonumber {
    public static int product(int c,int d){
        int multiply = c*d;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = product(a,b);
        System.out.println("product of two numbwer is "+ prod);

    }
}
