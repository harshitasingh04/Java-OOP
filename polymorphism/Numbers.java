package polymorphism;

public class Numbers {
    
    int sum (int a, int b) {
        return a+b;
    }
    int sum (int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(10, 20);
        num.sum(100, 500, 190);
    }
}
