package staticExample;

public class Main {
    public static void main(String[] args) {
        //main is the first thing which runs when you run a java program
        //if we dont put it as static it wont run
        //because we need to create object of all the methods inside a class
        //to be able to run it
        //Hence we need to run main without having to create object for main method
        //thats why its static
        //Human kunal = new Human(25, "Kunal", 50000, false);
        //Human rahul = new Human(13, "Rahul", 5000, false);
        //Human arpit = new Human(12, "Arpit", 5000, false);
        //System.out.println(kunal.name);
        //System.out.println(Human.population);
        //System.out.println(rahul.population);
        //System.out.println(arpit.population);
        //greeting();
        //Main funn = new Main();
        //funn.fun2();
        fun();
        Human.message();
    }
    //we know something which is nt static belongs to an object
    //this is not dependent on objects
    static void fun(){
        //greeting();//you cannot use this because it requires an instance
        //but the function you are using it in doesnot require an instance
        //you cannot access non static stuff without referencing their instances in
        //a static context
        Main obj = new Main();//hence, here I am referencing it 
        obj.greeting();
    } 
    void fun2() {
        greeting();
    }
    //this is dependent on objects
    void greeting(){
        System.out.println("Hello World!");
    }
}