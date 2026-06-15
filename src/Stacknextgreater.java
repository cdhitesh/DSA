import java.util.Stack;

public class Stacknextgreater {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,8};
        Stack<Integer> s = new Stack<>();
        int nxtgreatest[] = new int[arr.length];
        for (int i = args.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nxtgreatest[i] =-1;
            } else {
                nxtgreatest[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i =0 ; i<nxtgreatest.length;i++){
            System.out.print(nxtgreatest[i]);
        }
        System.out.println();
    }
}
