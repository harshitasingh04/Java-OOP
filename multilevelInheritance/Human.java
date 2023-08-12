package inheritance.multilevelInheritance;

public class Human {
    String name;
    int age;
    boolean married;
    double salary;
    static long population;
    Human() {
        this.name = "Kuch Nhi";
        this.age =100;
        this.married = true;
        this.salary = 580000.50;
        Human.population = +1;
    }
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Human(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }
    Human(Human other) {
        this.age = other.age;
        this.name =other.name;
        this.married = other.married;
        this.salary = other.salary;
    }
}