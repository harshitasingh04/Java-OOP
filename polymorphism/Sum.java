package polymorphism;

public class Sum {
    int sum(int a, int b) {
        return a+b;
    }
    double sum (double a, double b, double c) {
        return a+b+c;
    }
    int sum (int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        Sum sum1 = new Sum();
        int k = sum1.sum(1,2);
        System.out.println(k);
        int l = sum1.sum(1, 2, 3);
        System.out.println(l);
        double m = sum1.sum(1.1, 2.3, 4.2);
        System.out.println(m);
    }
}
