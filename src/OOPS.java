class Pen{
    String color;
    String type ;
    public void write(){
        System.out.println("writing something");
    }
}
public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColour("Blue");
        System.out.println(p1.colour);  // Correctly print colour
        p1.setTip(5);
        System.out.println(p1.tip);  // Correctly print tip

        Student s1 = new Student();
        s1.name = "John";
        s1.rollno = 101;
        s1.calcPercentage(80, 90, 85);
        System.out.println(s1.percentage);
        bankpassword myacc = new bankpassword();
        myacc.username ="gcjhvy";
//        myacc.password =" yyitvyt"; it gives me error because passwoard is private
        myacc.setpassword("jdhbvlj");

    }
    static class bankpassword{
         public String username ;
         private String password ;
         public void setpassword(String pwd){
             password = pwd;
        }
    }
    static class Pen {  // Make Pen a static nested class
        String colour;
        int tip;
        String getColour(){
            return this.colour;
        }
        int gettip(){
            return this.tip;
        }


        void setColour(String newColour) {
            colour = newColour;
        }

        void setTip(int Tip) {
            this.tip = Tip;
//            this is more usefull when two variables are of same name in same class
        }
    }

    static class Student {  // Make Student a static nested class
        String name;
        int rollno;
        float percentage;

        void calcPercentage(int phy, int che, int maths) {
            percentage = (phy + che + maths) / 3.0f;
        }
    }
}
