package basics.loops;

public class patternprinting {
    public static void main(String[] args) {
        for (int line = 1;line<=4;line++){
            for (int star = 1 ;star<=line ; star++){
                System.out.print("*");
            }
            System.out.println( );
        }
//        inverted star pattern
        int n =4;
        for (int line = 1;line<=4;line++){
            for (int star = 1; star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
//        print half pyramid
        for (int i = 1 ; i<=4;i++){
            for (int j =1;j<= i;j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
