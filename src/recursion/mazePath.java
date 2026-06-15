package recursion;

public class mazePath {
    public static void main(String[] args) {
        int col = 2;
        int row = 2;
        int count = maze(1,1,col,row);
        System.out.println(count);
    }

    private static int maze(int sc , int sr , int ec, int er){
        if(sc>ec || sr>er){
            return 0;
        }
        if(sc==ec || sr==er){
            return 1;
        }
        int downways = maze(sc+1,sr,ec,er);
        int rightways = maze(sc,sr+1,ec,er);
        int total = downways + rightways ;
        return total;
    }
}
