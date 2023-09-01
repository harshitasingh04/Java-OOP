package inheritance.multilevelInheritance;

public class Person extends Human{
    String bodyType;
    Person() {
        this.bodyType = "Curvy";
    }
    Person(String name, int age, String bodyType) {
        super(name, age);
        this.bodyType = bodyType;
    }
    Person(String name, int age, boolean married, String bodyType) {
        super(name, age, married);
        this.bodyType = bodyType;
    }
    Person( Person other ) {
        super(other);
        this.bodyType = other.bodyType;
    }
}