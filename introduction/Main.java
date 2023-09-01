package introduction;
import accesscontrol.publicM.PublicModifier;
public class Main {
    public static void main(String[] args) {
        //store 5 roll no
        //int[] numbers = new int[5];
        //store 5 names
        //String[] names  = new String[5];
        //data of 5 students : (roll no, name, marks)
        //int[] rno = new int[5];
        //String[] name = new String[5];
        //float[] marks = new float[5];
        //But if we want to write these data of student in one line, 
        //then we need a new data type, here the concept of OOP
        //comes into the picture and we use class as a data type
        //For Example
        //Student[] students = new Student[5];
        //Now
        //Student kunal;
        //kunal = new Student();
        //Student rahul = new Student();
        //Student random = new Student(kunal);
        //System.out.println(random.name);
        //kunal.rno = 13;
        //kunal.name = "Kunal";
        //System.out.println(kunal.name);  
        //kunal.greeting();      
        //to do this, we need to create a class
        Student random2 = new Student();
        System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        one.name = "Something";
        System.out.println(two.name);

        // Access Modifiers

        PublicModifier obj = new PublicModifier(10);
        obj.num = 5; //We can access this here because it is public
    }
}
class Student {
    int rno;
    String name;
    double marks;
    //void greeting() {
    //    System.out.println("Hello, my name is " + this.name);
    //}
    //we need a way to add the values of the above
    //properties object by object
    //we need one word to access every object 
    //Student(Student other) {
    //    this.name = other.name;

    //}
    Student() {
        //this is how you call a constructor from another constructor
        //internally Student(13, "harshita", 100.00 );
        this(13, "harshita", 100.00 );
    }
    //Student arpit = new Student(17, "Arpit", 89.7f);
    //Here, this will be replaced with arpit
    Student(int roll, String name, double marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
} 