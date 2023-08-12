package inheritance.singleInheritance;

public class Human {
    int limbs;
    String name;

    public void speak(String name) {
        System.out.println("Hello, my name is " + name);
    }

    public void count(int limbs) {
        System.out.println("I have " + limbs + " limbs");
    }
}
