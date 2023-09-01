package polymorphism;

public class Base {
    void speak(){
        System.out.println("I am in Base class");
    }
    public static void main(String[] args) {
        Base base = new Base();
        base.speak();
        Base base1 = new ChildOne();
        base1.speak();
        // base1.fun(); 
        Base base2 = new ChildTwo();
        base2.speak();
    }
}
class ChildOne extends Base {
    @Override
    void speak() {
        System.out.println("I am in Child class 1");
    }
    // @Override
    void fun() {
        System.out.println("Just for checking");
    }
}
class ChildTwo extends Base {
    @Override
    void speak() {
        System.out.println("I am in Child Class 2");
    }
}
