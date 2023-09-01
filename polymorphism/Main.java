package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shape.area();
        circle.area();
        square.area();
        triangle.area();
    }
}