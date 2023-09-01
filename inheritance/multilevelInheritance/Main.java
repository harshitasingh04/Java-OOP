package inheritance.multilevelInheritance;

public class Main {
    public static void main(String[] args) {
        Harshita harshita1 = new Harshita();
        System.out.println(harshita1.nature);
        Harshita harshita2 = new Harshita("Harshita", 22, "Slim", "Happy");
        System.out.println(harshita2.name + " " + harshita2.age + " " + harshita2.bodyType + " " + harshita2.nature);
        Harshita harshita3 = new Harshita(harshita2);
        System.out.println(harshita3.age);
    }
}