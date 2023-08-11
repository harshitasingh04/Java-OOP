package inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(4, 6.9, 2.4);
        // Box box1 = new Box(box);
        // System.out.println(box.l + " " + box.h + " " + box.w);
        // System.out.println(box1.w);
        // BoxWeight box2 = new BoxWeight();
        // System.out.println(box2.weight + " " + box2.h + " " + box2.l + " " + box2.w);
        Box box3 = new BoxWeight(2,3,4 ,8);
        System.out.println(box3.l);
    }
}