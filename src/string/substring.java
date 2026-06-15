package string;

public class substring {
    public static String sub(String str , int si,int ei){
        String substr = "";
        for (int i =si ; i <ei; i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "hello world";
//      we also have that inbuild function in java for substring
        System.out.println(str.substring(0,5));
        System.out.println(sub(str,5,11));
        String fruit[] = {"apple","mango","banana" };
        String largest = fruit[0];
        for (int i =0 ; i<fruit.length;i++){
            if (largest.compareTo(fruit[i])<0){
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
