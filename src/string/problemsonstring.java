package string;
import java.util.Scanner;
public class problemsonstring {
    public static void printletter(String Str){
        for (int i =0 ; i<Str.length();i++){
            System.out.print(Str.charAt(i));
        }
        System.out.println();
    }
    public static float displacement(String path){
//        use float as a variable
        int X =0 ; int Y = 0;
        for (int i =0 ; i<path.length(); i++ ){
            char dir = path.charAt(i);
            if (dir == 'S'){
                Y--;
        } else if (dir == 'N') {
                Y++;
            } else if (dir == 'W') {
                X--;
            } else {
                X++;
            }
        }
        int x2 = X*X;
        int Y2 = Y*Y;
        return (float) Math.sqrt(x2+Y2);
    }
    public static void main(String[] args) {
        String fullname = "hitesh tiwari";
        printletter(fullname);
        String path = "WNEENESENNN";
        System.out.println(displacement(path));
    }
}
