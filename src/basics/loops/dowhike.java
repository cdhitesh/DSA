package basics.loops;

public class dowhike {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("hello world ");
            counter++;
        } while (counter <= 9);
        for (int i =0; i<=10;i++){
            if (i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("you are out of the loop ");
//        continue keyword
//        this is use to miss any perticular ittration
        for (int i=0 ;i<4;i++){
            if (i ==1){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("you miss the ittration no. 3" );
    }

}
