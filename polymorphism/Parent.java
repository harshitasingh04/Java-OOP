package polymorphism;

public class Parent {
    static void speak() {
        System.out.println("Hi, My name is Harshita");
    }
}
class Child extends Parent {
    static void speak() {
      System.out.println("Hi, My name is Harshita Singh");  
    }
    public static void main(String[] args) {
        //Parent obj = new Child();
        Parent.speak();
    }
}