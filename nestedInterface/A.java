package nestedInterface;

public class A {
    
    //nested interface
    //nested interface can be declared as public, private, protected
    //but top-level interface has to public or default
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}
 
class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
