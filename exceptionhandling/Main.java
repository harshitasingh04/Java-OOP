 package exceptionhandling;

public class Main {
    public static void main(String[] args) {
        //int a = 5;
        //int b = 0;
        try {
            //divide(a, b);
            //throw new Exception("Just for Fun");
            String name = "HARSHITA";
            if(name.equals("HARSHITA")) {
                throw new MyException("Name is Harshita");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("Please do not divide by zero.");
        }
        return a/b;
    }


}
