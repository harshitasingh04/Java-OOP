package lambdafunctions;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            arr.add(i);
        }
        arr.forEach((item)-> {
            System.out.println(item*2);
        });
        Operation sum = (a, b) -> a+b;
        Operation product = (a, b) -> a*b;
        Operation subtraction = (a, b) -> a-b;
        LambdaFunctions fun = new LambdaFunctions();
        System.out.println(fun.operate(5, 3, subtraction));
        System.out.println(fun.operate(5, 3, sum));
        System.out.println(fun.operate(5, 3, product));
  
    }
    private int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }
}
interface Operation {
    int operation(int a, int b);
}