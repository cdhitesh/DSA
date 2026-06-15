public class problemsonrecursion {
    public static int tiles(int n){
//        base case
        if ( n ==0 || n == 1){
            return 1;
        }
//        kaam
//        this case is for vertical
        int fm1 = tiles(n-1);
//        this case is horizantal
        int fm2 = tiles(n-2);
        int total = fm1 + fm2;
        return total;
    }
    public static int paring(int n){
        if (n==1|| n ==2){
            return n;
        }
//        singel
        int fm1 = paring(n-1);
//        pair
        int fm2 = paring(n-2);
        int totalpair = (n-1) + fm2;
        return totalpair;
    }
    public static void main(String[] args) {
        System.out.println(tiles(3));
        System.out.println(paring(3));
    }
}
