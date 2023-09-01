package extendDemo;

public class Main implements B{

    @Override
    public void greet() {
        System.err.println("Namaste");
    }
    // @Override
    // public void fun() {
    //     System.err.println("Enjoy");
    // }
        public static void main(String[] args) {
            Main obj = new Main();
            obj.greet();
            A.greeting();
        }
        @Override
        public void fun() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'fun'");
        }
}
