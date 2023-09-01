package extendDemo;

public interface A {

    //static interface methods should always have a body
    //call via the interface name
    static void greeting() {
        System.out.println("Hi");
    }
    void fun();
}
