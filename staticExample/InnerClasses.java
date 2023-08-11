package staticExample;

//outer classes cannot be static because it 
//doesnot depend on any other class
public class InnerClasses {
    //Inner classes can be static because they
    //are dependent on the outer classes
   static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        System.out.println(a);
        System.out.println(b.name);
    }
}
