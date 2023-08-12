package inheritance.hierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Maruti marutinew = new Maruti();
        marutinew.engine = "Petrol";
        marutinew.color = "White";
        marutinew.fuelCapacity = 80.50;
        marutinew.milaege = 500;
        Tesla teslanew = new Tesla();
        teslanew.color = "Black";
        teslanew.engine = "Electric";
        teslanew.fuelCapacity = 1000.500;
        teslanew.milaege = 20000;
        System.out.println(marutinew.engine + " " + marutinew.color + " " + marutinew.fuelCapacity + " " + marutinew.milaege);
        System.out.println(teslanew.color + " " + teslanew.engine + " " + teslanew.fuelCapacity + " " + teslanew.milaege);
    }
}
