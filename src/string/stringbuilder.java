package string;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch<= 'z' ; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
//        complexity 0(26n) in stringbuilder
//        complexity in string 0(26* n ^2)
//        because strings are immutble to for any chnage it add or copy it self so the complexity will inc.
    }
}
