import java.util.Scanner;

public class array {
    public static void update(int[] marks){
        for (int i =0 ;i<= marks.length;i++ ){
            marks[i]= marks[i] +1;
        }
    }
    public static void main(String[] args) {
//        creation of array
        int num[] =new int[50];
//        we can not change the value of array once we impliment the code
        int number[] = {24,45,67};
        String fruit[] = {"apple","mango","banana"};
//        input and output
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("math " + marks[2]);
        marks[2] = marks[2]+1;
        System.out.println("updated marks are : "+ marks[2]);
        update(marks);
//        printing updated marks
        for (int i =0 ; i<= marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
