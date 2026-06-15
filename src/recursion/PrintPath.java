package recursion;

public class PrintPath {
    public static void main(String[] args) {
        int col = 2;
        int row = 2;
        print(1,1,col,row," ");
    }
    private static void print(int sc , int sr , int ec, int er, String s) {
        if (sc > ec || sr > er) {
            return ;
        }
        if (sc == ec && sr == er) {
            System.out.println(s);
            return;
        }
        print(sc+1,sr,ec,er,s+"R");
        print(sc,sr+1,ec,er,s+"D");
    }
}
