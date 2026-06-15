package basics;

public class switchstatemnt {
    public static void main(String[] args) {
        int number =2;
        switch (number){
            case 2 :
                System.out.println("samosa");
                break;
            case 1 :
                System.out.println("poha");
                break;
            case 3 :
                System.out.println("chai");
                break;
            default:
                System.out.println("we wake up ");
//                we can also write case sequence in unordered way
        }
    }
}
