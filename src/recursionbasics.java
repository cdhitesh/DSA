public class recursionbasics {
    public static void printdec(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void printinc(int m){
        if (m == 10){
            System.out.println(m);
            return;
        }
        System.out.print(m+" ");
        printinc(m+1);
//        answer is right but , we have to solve it for n only
    }
    public static void printincc(int n){
        if (n == 1){
            System.out.print(n);
            return;
        }
        printincc(n-1);
        System.out.print(n);
    }
    public static int factorial(int f){
        if ( f == 0){
            return 1;
        }
        int fact = f*factorial(f-1);
        return fact;
    }
    public static int natural(int n){
        if ( n == 1){
            return 1;
        }
        int sum = n +natural(n-1);
        return sum;
    }
    public static int fibonacci(int n){
        if ( n == 0 || n ==1){
            return n;
        }
        int f1 = fibonacci(n-1);
        int f2 = fibonacci(n-2);
        int fib = f1 + f2 ;
        return fib;
    }
    public static boolean issorted(int[] arr , int i ){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }
    public static int firstoccarance(int[] arr , int i ,int key){
        if (i== arr.length-1){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstoccarance(arr,i+1,key);
    }
//    public static int lastoccerence(int[] arr,int key,int i){
//        if (i == arr.length-1){
//            return -1;
//        }
//        int found = lastoccerence(arr,key,i+1);
//        if (found != -1){
//            return found;
//        }
//        if (arr[i]==key){
//            return i;
//        }
//
//    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 10;
        int m = 1;
        int f = 5;
        printdec(n);
        printinc(m);
        printincc(n);
        System.out.println(factorial(f));
        System.out.println(natural(n));
        System.out.println(fibonacci(n));
        System.out.println(issorted(arr,0));
        System.out.println(firstoccarance(arr,0,5));
//        System.out.println(lastoccerence(arr,5,0));
    }
}




