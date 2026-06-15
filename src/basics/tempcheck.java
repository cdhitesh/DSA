package basics;

import java.util.Scanner;

public class tempcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your tempereture : ");
        float temp = sc.nextFloat();
        if (temp>100){
            System.out.println("you have a high feaver");
        } else {
            System.out.println("your feaver is in controle ");
        }

    }
}
