package basics;

public class conditionalstatements {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18){
            System.out.println("drive , vote ");
        }
        if (age >=11 && age <= 18){
            System.out.println("teenager ");
        }
       else if (age >= 20){
            System.out.println("yes");
        }
        else{
            System.out.println("teenager ");
//            if ststement check every statement where in else if if if is true not cannot check else if statemnt it can simply print the output of if  statementb
        }
    }
//    summary is if if statement print then else does not but if we write if statement after else statement it will also print if both are true
}

