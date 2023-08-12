package inheritance.multilevelInheritance;

public class Harshita extends Person{
    String nature;
    Harshita() {
        this.nature = "Moody";
    }
    Harshita(String name, int age, String bodyType, String nature) {
        super(name, age, bodyType);
        this.nature = nature;
    }
    Harshita(String name, int age, boolean married, String bodyType, String nature) {
        super(name, age, married, bodyType);
        this.nature = nature;
    }
    Harshita(Harshita other) {
        super(other);
        this.nature = other.nature;
    }
}