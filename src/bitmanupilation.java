public class bitmanupilation {
    public static void evenorodd(int n){
        int bitwise = 1;
        if ((n & bitwise)==0){
            System.out.println("it is a even number : ");
        } else {
            System.out.println("it is an odd number : ");
        }
    }
    public static void main(String[] args) {
        evenorodd(9);
        evenorodd(3);
        evenorodd(4);
    }
}
