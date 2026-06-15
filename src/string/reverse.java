package string;

public class reverse {
    public static void main(String[] args) {
        String originalstring = "Hitesh";
        char[] newstring = originalstring.toCharArray();
        String reverse = "";
        for (int i = newstring.length-1;i>=0;i--){
            reverse +=newstring[i];
        }
        System.out.println(originalstring);
        System.out.println(reverse);
    }
}
