public class constructors {
    public static void main(String[] args) {
        student s1 = new student("hitesh");
        System.out.println(s1.name);
        student s2 = new student();
    }
}
class student{
    String name ;
    int roolno ;

    student(String name){ // constructor.
        // perimeter constructor
        this.name = name;
    }
    student(){ // it i comment thiss constructor and not that s1 statment in main functions then it gives error if you wnat to run that first
        //line then also have to deelete all constructor
        // non perimeter constructor
        System.out.println("this is called constructor ....");
    }

}
